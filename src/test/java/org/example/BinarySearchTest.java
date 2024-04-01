package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void binarySearch() {
        Assertions.assertEquals(2,BinarySearch.binarySearch(new int[]{5, 7, 3, 0, 2}, 3));
    }
}