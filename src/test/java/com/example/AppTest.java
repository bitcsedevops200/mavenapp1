package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void stringShouldRemainUnchanged() {
        String original = "Hello";
        String modified = original.concat(" World");

        assertEquals("Hello", original);
        assertEquals("Hello World", modified);
    }
}
