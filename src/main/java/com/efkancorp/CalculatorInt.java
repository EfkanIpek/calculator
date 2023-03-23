package com.efkancorp;

public class CalculatorInt {

    public int addNumbers(int a, int b) throws TooBigNumberException {
        float result = a + b;
        if (a>0 && b >0 && result <0){
            throw new TooBigNumberException("Too big for floats !");
        }
            return a + b;
    }

    public int substractNumbers(int a, int b) {
        return a - b;
    }

    public int divideNumbers(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int multiplyNumbers(int a, int b) {
        return a * b;
    }
}
