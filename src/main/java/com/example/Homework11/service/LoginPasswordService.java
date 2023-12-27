package com.example.Homework11.service;

import com.example.Homework11.exception.WrongLoginException;
import com.example.Homework11.exception.WrongPasswordException;

public interface LoginPasswordService {
    String validation(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException;
}
