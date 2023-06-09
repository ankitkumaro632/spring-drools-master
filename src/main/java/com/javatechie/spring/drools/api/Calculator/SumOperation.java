package com.javatechie.spring.drools.api.Calculator;

public class SumOperation {

    private int operand1;
    private int operand2;
    private int result;

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public SumOperation(int operand1, int operand2, int result) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    @Override
    public String toString() {
        return "SumOperation{" +
                "operand1=" + operand1 +
                ", operand2=" + operand2 +
                ", result=" + result +
                '}';
    }
}
