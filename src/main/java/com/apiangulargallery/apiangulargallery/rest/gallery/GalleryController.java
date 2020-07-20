package com.apiangulargallery.apiangulargallery.rest.gallery;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GalleryController {

    private final GalleryService galleryService;

    GalleryController(GalleryService galleryService) {
        this.galleryService = galleryService;
    }

    @PostMapping("/addGallery")
    public String saveGallery(@RequestBody Gallery gallery) {
        galleryService.addGallery(gallery);
        return "Added gallery with id: " + gallery.getId();
    }

    @GetMapping("/getAllGalleries")
    public List<Gallery> getGalleries() {
        return galleryService.getAllGalleries();
    }

    @GetMapping("/getGallery/{id}")
    public Gallery getGallery(@PathVariable String id) {
        return galleryService.getGallery(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGallery(@PathVariable String id) {
        galleryService.deleteGallery(id);
        return "deleted gallery with id: " + id;
    }
}
