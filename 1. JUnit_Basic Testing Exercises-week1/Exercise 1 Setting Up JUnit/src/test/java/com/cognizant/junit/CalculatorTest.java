package com.cognizant.junit;

import com.cognizant.junit.service.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }
}