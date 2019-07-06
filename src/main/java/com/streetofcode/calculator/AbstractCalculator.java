package com.streetofcode.calculator;

import com.streetofcode.Operands;
import com.streetofcode.operation.Operation;

import java.util.Map;

abstract class AbstractCalculator {
    private Map<Character, Operation> operationMap;

    AbstractCalculator(Map<Character, Operation> operationMap) {
        this.operationMap = operationMap;
    }

    double calculate(Operands operands, Character operator) {
        if (operationMap.containsKey(operator)) {
            return calculateResult(operands, operationMap.get(operator));
        } else {
            throw new IllegalArgumentException("This calculator doesn't support operator: " + operator);
        }
    }

    private double calculateResult(Operands operands, Operation operation) {
        return operation.calculate(operands.getLeft(), operands.getRight());
    }
}
