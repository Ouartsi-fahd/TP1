package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        Assertions.assertEquals(true,Anagram.isAnagram("Ordinateur","Dur notaire"));
    }

}