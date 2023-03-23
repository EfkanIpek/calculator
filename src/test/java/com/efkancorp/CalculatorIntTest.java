package com.efkancorp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorIntTest {

    @Test
    void addNumbers3plus12Equals15() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertEquals(15, calculatorInt.addNumbers(3,12));
    }

    @Test
    void addNumbersMinus5PlusMinus312EqualsMinus8() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertEquals(-8, calculatorInt.addNumbers(-5,-3));
    }

    @Test
    void substractNumbers25Minus8Equals17() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertEquals(17, calculatorInt.substractNumbers(25,8));
    }
    @Test
    void substractNumbersMinus35MinusMinus10EqualsMinus25() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertEquals(-25, calculatorInt.substractNumbers(-35,-10));
    }

    @Test
    void divideNumbers18DividedBy5Equals3() {
        var calculator = new CalculatorInt();
        assertEquals(3,calculator.divideNumbers(18,5));
    }

    @Test
    void divideNumbers20DividedBy0Throws() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertThrows(ArithmeticException.class, () -> calculatorInt.divideNumbers(20,0));
    }

    @Test
    void multiplyNumbers5Times8Equals40() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertEquals(40, calculatorInt.multiplyNumbers(5,8));
    }

    @Test
    void multiplyNumbersMinus6Times4EqualsMinus24() {
        CalculatorInt calculatorInt = new CalculatorInt();
        assertEquals(-24, calculatorInt.multiplyNumbers(-6,4));
    }
}