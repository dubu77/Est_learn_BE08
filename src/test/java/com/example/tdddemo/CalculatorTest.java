package com.example.tdddemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("양의 정수의 합")
    void testAddTwoPositiveNumbers() {
        int result = calculator.add(3, 4);
        assertEquals(7, result, "3+4 should equal 7");
    }

    @Test
    @DisplayName("음의 정수의 합")
    void testTwoNegativeNumbers() {
        int result = calculator.add(3, -4);
        assertEquals(-1, result, "-1 필요");
    }

    @Test
    @DisplayName("양의 정수와 음의 정수의 합")
    void testAddPositiveAndNegativeNumber() {
        int result = calculator.add(3, -4);
        assertEquals(-1, result, "3 + (-4) should equal -1");
    }

    @Test
    @DisplayName("정수와 0의 합")
    void testAddZero() {
        int result = calculator.add(3, 0);
        assertEquals(3, result, "3 + 0 should equal 3");
    }

    @Test
    @DisplayName("1과 정수 최대값의 합")
    void testAddWithOverflow() {
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1),
                "Adding 1 to MAX_VALUE should result in MIN_VALUE due to overflow");
    }

}