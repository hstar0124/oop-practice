package org.testcode;

public class WrongFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "ab";      // 2 글자
    }
}
