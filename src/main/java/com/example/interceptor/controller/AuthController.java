package com.example.interceptor.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/api/foo-bar")
    public ResponseEntity<Void> getFoobar() {
        return ResponseEntity.noContent().build();
    }
}
