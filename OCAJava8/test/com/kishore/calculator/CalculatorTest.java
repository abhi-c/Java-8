package com.kishore.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.kishore.calculator.Calculator;

class CalculatorTest {

	@Test
	final void testAdd() {
		Calculator c = new Calculator();
		int value = c.add(5,7);
		
		assertEquals(12, value);
	}
	
	@Test
	final void testAddWithNegative() {
		Calculator c = new Calculator();
		int value = c.add(5,-7);
		
		assertEquals(12, value);
	}
	
	@Test
	final void testAddWthBothNegative() {
		Calculator c = new Calculator();
		int value = c.add(5,-7);
		
		assertEquals(12, value);
	}

}
