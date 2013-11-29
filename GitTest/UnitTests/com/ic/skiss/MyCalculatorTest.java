package com.ic.skiss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyCalculatorTest {

	MyCalculator myCalculator = new MyCalculator();
	
	@Test
	public void shouldAddRetuns2() {
		assertEquals("Should equal: ", 2, myCalculator.myAdd(1, 1));
	}
}
