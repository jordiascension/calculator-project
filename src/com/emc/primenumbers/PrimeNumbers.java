package com.emc.primenumbers;

import java.util.ArrayList;

public class PrimeNumbers {

	public ArrayList<Integer> searchPrimeNumbers(int[] numbers) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			if (isPrime(numbers[i]))
				primeNumbers.add(numbers[i]);
		}

		return primeNumbers;
	}

	public boolean isPrime(int numero) {
		// El 0, 1 y 4 no son primos
		if (numero == 0 || numero == 1 || numero == 4) {
			return false;
		}
		for (int x = 2; x < numero / 2; x++) {
			// Si es divisible por cualquiera de estos números, no
			// es primo
			if (numero % x == 0)
				return false;
		}
		// Si no se pudo dividir por ninguno de los de arriba, sí es primo
		return true;
	}

}
