package com.apiangulargallery.apiangulargallery.rest.photo;

import com.apiangulargallery.apiangulargallery.rest.gallery.Gallery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Gallery, String> {
}
