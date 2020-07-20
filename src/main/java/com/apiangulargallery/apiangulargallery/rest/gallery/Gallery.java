package com.apiangulargallery.apiangulargallery.rest.gallery;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@ToString

@Document(collection = "Gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String galleryName;
}