package com.streetofcode.calculator;

import com.streetofcode.operation.Operation;

import java.util.HashMap;

class AdvancedCalculator extends AbstractCalculator {

    AdvancedCalculator(HashMap<Character, Operation> operationMap) {
        super(operationMap);
    }
}
