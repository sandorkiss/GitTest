package com.ic.skiss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyCalculatorTest {

    MyCalculator myCalculator = new MyCalculator();

    @Test
    public void shouldAddReturnTwo() {
	assertEquals("Should equal: ", 2, myCalculator.myAdd(1, 1));
    }
    
    @Test
    public void shouldMultiplyReturnTen() {
	assertEquals("Should equal: ", 10, myCalculator.myMultiply(2, 5));
    }
}
