package com.apiangulargallery.apiangulargallery.rest.gallery;

import com.apiangulargallery.apiangulargallery.rest.photo.Photo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "Gallery")
public class Gallery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String galleryId;
    private String title;
    private String description;
    private String dateCreated;
    private String thumbUrl;
    private List<String> tags;
    private List<Photo> photos;
}