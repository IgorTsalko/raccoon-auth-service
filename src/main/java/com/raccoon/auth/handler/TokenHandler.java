package com.raccoon.auth.handler;

import com.raccoon.auth.model.Token;

public interface TokenHandler {

    Token generateToken();
}
