package com.szymon.service;

import com.szymon.model.Image;
import com.szymon.model.Link;
import com.szymon.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public List<Image> fetchImages() {
        List<Image> images = new ArrayList<>();
        Iterable<Image> iterable = imageRepository.findAll();
        iterable.forEach(images::add);
        return images;
    }
}
