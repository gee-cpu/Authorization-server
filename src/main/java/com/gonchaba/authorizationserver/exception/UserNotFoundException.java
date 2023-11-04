package com.gonchaba.authorizationserver.exception;

public class  UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
