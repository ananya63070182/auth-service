package com.lab12.authservice.controller;

import com.lab12.authservice.entities.AuthRequest;
import com.lab12.authservice.entities.AuthResponse;
import com.lab12.authservice.services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(final AuthService authService){
        this.authService = authService;
    }

    @PatchMapping(value = "/login")
    public ResponseEntity<AuthResponse> logIn(@RequestBody AuthRequest authRequest){
        return ResponseEntity.ok(authService.logIn(authRequest));
    }
}
