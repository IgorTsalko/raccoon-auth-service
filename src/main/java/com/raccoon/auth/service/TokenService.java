package com.raccoon.auth.service;

import com.raccoon.auth.model.Credentials;
import com.raccoon.auth.model.Token;

public interface TokenService {

    Token issueToken(Credentials credentials);
}
