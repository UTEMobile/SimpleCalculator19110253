package com.example.simplecalculatr;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    Calculator mCalculator;
    static final double DELTA = 0.01;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void calculator() {
//        Phép cộng
        assertEquals(mCalculator.calculator("Add", 12, 5), 17, DELTA);
        assertEquals(mCalculator.calculator("Add", 100000, 5), 100005, DELTA);
        assertEquals(mCalculator.calculator("Add", 1, 2), 3, DELTA);
        assertEquals(mCalculator.calculator("Add", -5, 7), 2, DELTA);
        assertEquals(mCalculator.calculator("Add", 2.5, 3), 5.5, DELTA);

//        Phép trừ
        assertEquals(mCalculator.calculator("Sub", 1, 5), -4, DELTA);
        assertEquals(mCalculator.calculator("Sub", 123, 2), 121, DELTA);
        assertEquals(mCalculator.calculator("Sub", 4, 5), -1, DELTA);
        assertEquals(mCalculator.calculator("Sub", -5, -2), -3, DELTA);
        assertEquals(mCalculator.calculator("Sub", -2.5, 3), -5.5, DELTA);

//        Phép chia
        assertEquals(mCalculator.calculator("Div", 1, 5), 0.2, DELTA);
        assertEquals(mCalculator.calculator("Div", 1, 3), 0.33, DELTA);
        assertEquals(mCalculator.calculator("Div", 4, 123), 0.0325, DELTA);
        assertEquals(mCalculator.calculator("Div", -5, -2), 2.5, DELTA);
        assertEquals(mCalculator.calculator("Div", -2.5, 3), -0.83, DELTA);
        assertEquals(mCalculator.calculator("Div", -2.5, 0), Double.NEGATIVE_INFINITY, DELTA);

//        Phép nhân
        assertEquals(mCalculator.calculator("Mul", 12, 5), 60, DELTA);
        assertEquals(mCalculator.calculator("Mul", 100000, 5), 500000, DELTA);
        assertEquals(mCalculator.calculator("Mul", 1, 2), 2, DELTA);
        assertEquals(mCalculator.calculator("Mul", -5, 7), -35, DELTA);
        assertEquals(mCalculator.calculator("Mul", 2.5, 3), 7.5, DELTA);

//        Mũ
        assertEquals(mCalculator.calculator("Exp", 2, 3), 8, DELTA);
        assertEquals(mCalculator.calculator("Exp", 10, 2), 100, DELTA);
        assertEquals(mCalculator.calculator("Exp", 1, 2), 1, DELTA);
        assertEquals(mCalculator.calculator("Exp", 0, 2), 0, DELTA);
        assertEquals(mCalculator.calculator("Exp", 2, 0), 1, DELTA);

//        Giai thừa
        assertEquals(mCalculator.facResult(2), 2, DELTA);
        assertEquals(mCalculator.facResult(4), 24, DELTA);
        assertEquals(mCalculator.facResult(5), 120, DELTA);
        assertEquals(mCalculator.facResult(9), 362880, DELTA);
        assertEquals(mCalculator.facResult(25), Double.POSITIVE_INFINITY, DELTA);

//        Log
        assertEquals(mCalculator.calculator("Log", 3, 4), 1.26, DELTA);
        assertEquals(mCalculator.calculator("Log", 10, 2), 0.3, DELTA);
        assertEquals(mCalculator.calculator("Log", 1, 2), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(mCalculator.calculator("Log", 10, 1000), 3, DELTA);
        assertEquals(mCalculator.calculator("Log", 2, 10000),  13.287712379549, DELTA);




    }
}