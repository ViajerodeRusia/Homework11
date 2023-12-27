package com.example.Homework11.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}

