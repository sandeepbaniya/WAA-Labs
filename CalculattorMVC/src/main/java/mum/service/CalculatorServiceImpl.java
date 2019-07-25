package mum.service;

import mum.domain.Calculator;

public class CalculatorServiceImpl implements CalculatorService {
    public void add(Calculator calculator) {
        calculator.add();
    }

    public void multiply(Calculator calculator) {
        calculator.multiply();
    }
}
