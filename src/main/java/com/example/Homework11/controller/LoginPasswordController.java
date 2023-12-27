package com.example.Homework11.controller;

import com.example.Homework11.exception.WrongLoginException;
import com.example.Homework11.exception.WrongPasswordException;
import com.example.Homework11.service.LoginPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/main")
@RestController
public class LoginPasswordController {
private final LoginPasswordService loginPasswordService;

    public LoginPasswordController(@Autowired LoginPasswordService loginPasswordService) {
        this.loginPasswordService = loginPasswordService;
    }

    @GetMapping
    public String validationLoginPassword(@RequestParam("login") String login, @RequestParam("password") String password,
                                          @RequestParam("confirm") String confirm) {
        try {
            return loginPasswordService.validation(login, password, confirm);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
