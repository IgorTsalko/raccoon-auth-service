package com.raccoon.auth.service;

import com.raccoon.auth.handler.TokenHandler;
import com.raccoon.auth.model.Credentials;
import com.raccoon.auth.model.Token;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class JWTTokenService implements TokenService {

    private final TokenHandler tokenHandler;

    @Override
    public Token issueToken(Credentials credentials) {
        return tokenHandler.generateToken();
    }
}
