package com.cognizant.junit;

import com.cognizant.junit.service.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup() {

        System.out.println("========== Before Each Test ==========");

        calculator = new Calculator();
    }

    @Test
    void testAdd() {

        // Arrange
        int num1 = 10;
        int num2 = 20;

        // Act
        int result = calculator.add(num1, num2);

        // Assert
        assertEquals(30, result);
    }

    @Test
    void testSubtract() {

        // Arrange
        int num1 = 20;
        int num2 = 5;

        // Act
        int result = calculator.subtract(num1, num2);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testMultiply() {

        // Arrange
        int num1 = 5;
        int num2 = 6;

        // Act
        int result = calculator.multiply(num1, num2);

        // Assert
        assertEquals(30, result);
    }

    @AfterEach
    void tearDown() {

        System.out.println("========== After Each Test ==========");

        calculator = null;
    }
}