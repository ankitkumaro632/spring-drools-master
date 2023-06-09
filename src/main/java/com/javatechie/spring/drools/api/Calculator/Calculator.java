package com.javatechie.spring.drools.api.Calculator;

public class Calculator {

    private int operand1;
    private int operand2;

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public Calculator(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                '}';
    }
}
