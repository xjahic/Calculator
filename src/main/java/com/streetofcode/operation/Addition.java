package com.streetofcode.operation;

public class Addition implements Operation {
    @Override
    public double calculate(double left, double right) {
        return left + right;
    }
}
