package com.streetofcode.calculator;

import com.streetofcode.Operands;
import com.streetofcode.operation.Operation;

import java.util.Map;

abstract class AbstractCalculator {

    private String name;
    private Map<Character, Operation> operationMap;

    AbstractCalculator(String name, Map<Character, Operation> operationMap) {
        this.name = name;
        this.operationMap = operationMap;
    }

    double calculate(Operands operands, Character operator) {
        if (operationMap.containsKey(operator)) {
            final double result = calculateResult(operands, operationMap.get(operator));
            printResult(result);
            return result;
        } else {
            throw new IllegalArgumentException("This calculator doesn't support operator: " + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation) {
        return operation.calculate(operands.getLeft(), operands.getRight());
    }

    private void printResult(double result) {
        System.out.println(this.name + " calculated result: " + result);
    }

}
