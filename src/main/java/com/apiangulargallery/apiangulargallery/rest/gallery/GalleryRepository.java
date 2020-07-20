package com.apiangulargallery.apiangulargallery.rest.gallery;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GalleryRepository extends MongoRepository<Gallery, String> {
}
