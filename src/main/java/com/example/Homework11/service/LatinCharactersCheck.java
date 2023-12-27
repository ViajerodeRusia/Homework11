package com.example.Homework11.service;

public class LatinCharactersCheck {
    public static boolean isStringContainsLatinCharactersOnly(final String StringToCheck)
    {
        return StringToCheck.matches("^[a-zA-Z0-9._]+$");
    }
}
