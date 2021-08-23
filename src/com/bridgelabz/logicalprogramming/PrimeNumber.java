package com.bridgelabz.logicalprogramming;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;

		System.out.println("Enter the number to be checked:");
		int numberToCheck = sc.nextInt();
		sc.close();

		if (numberToCheck == 1 || numberToCheck == 0) {
			System.err.println("0 and 1 are neither prime nor composite");
			System.exit(0);
		}

		for (int index = 2; index <= numberToCheck / 2; index++) {
			if (numberToCheck % index == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(numberToCheck + " is a Prime Number");
		} else {
			System.out.println(numberToCheck + " is not a Prime Number");
		}

	}

}
