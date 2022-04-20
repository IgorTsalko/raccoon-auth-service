package com.raccoon.auth.handler;

import com.raccoon.auth.model.Token;
import org.springframework.stereotype.Component;

@Component
public class JWTTokenHandler implements TokenHandler {

    @Override
    public Token generateToken() {
        // todo: issue new JWT-token
        return new Token("Mock token: " + "jwt-token-123");
    }
}
