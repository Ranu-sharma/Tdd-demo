package controller;

import model.Photo;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@SpringBootConfiguration

@RestController
@RequestMapping("/Photos")
public class PhotoController {
    @GetMapping
    public List<Photo> getAllPhotos() {
        List<Photo> photos = new ArrayList<>();
        return photos;


    }


    }



