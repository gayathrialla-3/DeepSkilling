package com.cognizant.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    void testAssertions() {

        // assertEquals
        assertEquals(5, 2 + 3);

        // assertTrue
        assertTrue(10 > 5);

        // assertFalse
        assertFalse(5 > 10);

        // assertNull
        String value = null;
        assertNull(value);

        // assertNotNull
        Object object = new Object();
        assertNotNull(object);
    }
}