package com.efkancorp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorFloatTest {

    @Test
    void addNumbers() {
        CalculatorFloat calculator = new CalculatorFloat();
        assertEquals(14.41, calculator.addNumbers(5.19f,9.22f), 0.001f);
    }

    @Test
    void substractNumbers() {
        CalculatorFloat calculatorFloat = new CalculatorFloat();
        assertEquals(0.00000000000000000001f,calculatorFloat.substractNumbers(0.00000000000000000001f,0f), 0.0001);
    }

    @Test
    void divideNumbers() {
        CalculatorFloat calculatorFloat = new CalculatorFloat();
        assertEquals(1000000000000000000000000000000f, calculatorFloat.divideNumbers(1f,0.000000000000000000000000000001f),0.0001);
    }

    @Test
    void divideNumbersOneThird() {
        CalculatorFloat calculatorFloat = new CalculatorFloat(); //should not pass
        assertEquals(0.3333333333333333333333333333333333333333333333333333f,calculatorFloat.divideNumbers(1f,3f),0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001d);
    }

    @Test
    void multiplyNumbers() {
        CalculatorFloat calculatorFloat = new CalculatorFloat();
        assertEquals(150,calculatorFloat.multiplyNumbers(0.15f,1000f),0.0000001f);
    }
}