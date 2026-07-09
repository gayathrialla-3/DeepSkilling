package com.cognizant.junit;

import com.cognizant.junit.service.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testUser() {

        User user = new User();

        assertEquals("Bhagyasri", user.getName());

        assertEquals(
                "Vignan's Institute of Engineering for Women",
                user.getCollege()
        );

        assertNotNull(user.getName());

        assertNotNull(user.getCollege());

        assertTrue(user.getName().length() > 0);

        assertFalse(user.getName().isEmpty());

    }
}