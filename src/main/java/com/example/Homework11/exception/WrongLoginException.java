package com.example.Homework11.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}
