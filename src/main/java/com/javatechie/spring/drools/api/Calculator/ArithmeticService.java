package com.javatechie.spring.drools.api.Calculator;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    public int calculateSum(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public int calculateDifference(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public int calculateProduct(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public double calculateDivision(int operand1, int operand2) {
        if (operand2 != 0) {
            return (double) operand1 / operand2;
        } else {
            throw new ArithmeticException("Division by zero not allowed.");
        }
    }
}
