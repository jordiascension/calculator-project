package com.emc.primenumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PrimeNumbersTest {

	PrimeNumbers primeNumbers = new PrimeNumbers();

	@Test
	void testSearchPrimeNumbers() {

		int[] numbers = new int[4];
		numbers[0] = 15;
		numbers[1] = 16;
		numbers[2] = 17;
		numbers[3] = 18;

		ArrayList<Integer> primeArray = primeNumbers
				.searchPrimeNumbers(numbers);

		ArrayList<Integer> primeArrayExpected = new ArrayList<Integer>();
		primeArrayExpected.add(17);
		assertEquals(primeArray, primeArrayExpected);
	}

	@Test
	void testEsPrimo() {

		assertTrue(primeNumbers.isPrime(17) == true);

	}

}
