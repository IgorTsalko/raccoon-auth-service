package com.raccoon.auth.controller;

import com.raccoon.auth.model.Credentials;
import com.raccoon.auth.model.Token;
import com.raccoon.auth.service.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class AuthController {

    private final TokenService tokenService;

    @PostMapping("/issue-token")
    public Token issueToken(@RequestBody Credentials credentials) {
        return tokenService.issueToken(credentials);
    }
}
