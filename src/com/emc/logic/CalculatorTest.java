package com.emc.logic;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertTrue(calculator.add(2, 2) == 4);
	}

	@Test
	void testSubstract() {
		assertTrue(calculator.substract(4, 2) == 2);
	}

	@Test
	void testMultiply() {
		assertTrue(calculator.multiply(2, 4) == 8);
	}

	@Test
	void testDivide() {
		assertTrue(calculator.divide(4, 4) == 1);
	}

}
