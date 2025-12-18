package com.vasigame.docker.image.controller;
import com.vasigame.docker.image.dto.StringDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Welcome {
    @GetMapping(
            produces = { "application/json", "application/xml" }
    )
    public ResponseEntity<?> welcomeMessage() {
        return  ResponseEntity.ok(new StringDTO("Welcome to the dockerized world!"));
    }



}
