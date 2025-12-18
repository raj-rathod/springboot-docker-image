package com.vasigame.docker.image.controller;

import com.vasigame.docker.image.dto.StringDTO;
import com.vasigame.docker.image.dto.UserRequestDTO;
import com.vasigame.docker.image.exception.ResourceNotFoundException;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/")
public class UserController {
    @GetMapping(
            value = "{id}",
            produces = { "application/json", "application/xml" }
    )
    public ResponseEntity<?> findUserById(@PathVariable int id){
        if (id <= 0) {
            throw new ResourceNotFoundException("User not found with id " + id);
        }
        return ResponseEntity.ok( new StringDTO("User Found with id " + id));
    }

    @PostMapping(
            consumes = { "application/json", "application/xml" },
            produces = { "application/json", "application/xml" }
    )
    public ResponseEntity<?> createUser(
            @Valid @RequestBody UserRequestDTO request) {

        return ResponseEntity.ok(new StringDTO("User Created"));
    }
}
