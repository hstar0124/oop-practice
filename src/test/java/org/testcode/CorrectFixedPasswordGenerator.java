package org.testcode;

public class CorrectFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "abcdefgh";      // 8 글자
    }
}
