package org.example.pwd_generator;

import org.example.pwd_generator.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcdefgh";      // 8 글자
    }
}
