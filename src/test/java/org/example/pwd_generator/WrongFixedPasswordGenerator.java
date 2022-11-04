package org.example.pwd_generator;

import org.example.pwd_generator.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab";      // 2 글자
    }
}
