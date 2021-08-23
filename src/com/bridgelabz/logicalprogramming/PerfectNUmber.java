package com.bridgelabz.logicalprogramming;

public class PerfectNUmber {

	public static void main(String[] args) {

		int sumOfDivisors = 0;
		int numberToCheck = 28;

		for (int index = 1; index <= numberToCheck / 2; index++) {
			if (numberToCheck % index == 0) {
				sumOfDivisors += index;
			}
		}
		if (sumOfDivisors == numberToCheck) {
			System.out.println(numberToCheck + " is a Perfect Number");
		} else {
			System.out.println(numberToCheck + " is not a Perfect Number");
		}
	}
}
