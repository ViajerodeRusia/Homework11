package com.example.Homework11.service;

import com.example.Homework11.exception.WrongLoginException;
import com.example.Homework11.exception.WrongPasswordException;
import org.springframework.stereotype.Service;

@Service
public class LoginPasswordServiceImpl implements LoginPasswordService{

    @Override
    public String validation(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException{
        if (login.length() >= 20 || !LatinCharactersCheck.isStringContainsLatinCharactersOnly(login)) {
            throw new WrongLoginException("Invalid login. Max 20 symbols allowed only and only latin letters. Length = %s".formatted(login.length()));
        }
        if (password.length() >= 20 || !LatinCharactersCheck.isStringContainsLatinCharactersOnly(password)) {
            throw new WrongPasswordException("Invalid password. Max 20 symbols allowed only and only latin letters. Length = %s".formatted(password.length()));
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords DO NOT match.");
        }
        return "Success.";
    }
}
