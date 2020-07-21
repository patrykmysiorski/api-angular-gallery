package com.apiangulargallery.apiangulargallery.rest.photo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@ToString

public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String photoId;
    private String thumbUrl;
}
