package com.javabuzzy.exceptionhandling.custom_exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String msg) {
        super(msg);
    }
}

