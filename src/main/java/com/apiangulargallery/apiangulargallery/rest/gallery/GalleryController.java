package com.apiangulargallery.apiangulargallery.rest.gallery;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class GalleryController {

    private final GalleryService galleryService;

    GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @PostMapping("/addGallery")
    public ResponseEntity<String> saveGallery(@RequestBody Gallery gallery) {
        var isAdded = galleryService.addGallery(gallery);
        if (!isAdded) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/getAllGalleries")
    public List<Gallery> getGalleries() {
        return galleryService.getAllGalleries();
    }

    @GetMapping("/getGallery/{id}")
    public Gallery getGallery(@PathVariable String id) {
        return galleryService.getGallery(id);
    }

    @DeleteMapping("/deleteGallery/{id}")
    public ResponseEntity<String> deleteGallery(@PathVariable String id) {
        var isRemoved = galleryService.deleteGallery(id);
        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
