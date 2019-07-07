package com.streetofcode.calculator;

import com.streetofcode.operation.Operation;

import java.util.HashMap;

class BasicCalculator extends AbstractCalculator {

    BasicCalculator(HashMap<Character, Operation> operationMap) {
        super("BasicCalculator", operationMap);
    }
}
