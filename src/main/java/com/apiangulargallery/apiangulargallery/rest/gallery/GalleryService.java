package com.apiangulargallery.apiangulargallery.rest.gallery;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GalleryService {

    private final GalleryRepository galleryRepository;

    GalleryService(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    public boolean addGallery(Gallery gallery) {
        galleryRepository.save(gallery);
        return true;
    }

    public boolean deleteGallery(String id) {
        galleryRepository.deleteById(id);
        return true;
    }

    public Gallery getGallery(String id) {
        Optional<Gallery> optionalGallery = galleryRepository.findById(id);
        return optionalGallery.orElse(null);
    }

    public List<Gallery> getAllGalleries() {
        return galleryRepository.findAll();
    }
}
