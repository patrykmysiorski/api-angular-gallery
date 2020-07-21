package com.apiangulargallery.apiangulargallery.rest.gallery;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.TimeZone;

@Service
public class GalleryService {

    private final GalleryRepository galleryRepository;

    GalleryService(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    public boolean addGallery(Gallery gallery) {
        gallery.setDateCreated(getCurrentDateIsoString());
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

    private String getCurrentDateIsoString() {
        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }
}
