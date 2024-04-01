package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome s;

    @BeforeEach
    public void Steup() {
        s = new Palindrome();
    }

    @Test
    public void testisPalindrome() {
        Assertions.assertEquals(true, Palindrome.isPalindrome(null));
    }

    @Test
    public void testisälondromNull() {
        try {
            Class<? extends Throwable> NullPointerException = null;
            Assertions.assertThrows(NullPointerException.class,()->Palindrome.isPalindrome(null));
        } catch (Exception e) {
            Assertions.fail(e.getMessage());
        }
    }
}