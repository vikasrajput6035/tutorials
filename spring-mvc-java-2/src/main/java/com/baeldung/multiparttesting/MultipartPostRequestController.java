package com.baeldung.multiparttesting;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class MultipartPostRequestController {

    @PostMapping(path = "/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<String>(HttpStatus.OK);
        }
    }
}