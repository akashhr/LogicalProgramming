package com.bridgelabz.logicalprogramming;

public class FibonacciSeries {

	public static void main(String[] args) {
		int totalNumber = 20;
		int previousNumber = 0, currentNumber = 1;
		System.out.print(previousNumber + " " + currentNumber);

		for (int index = 2; index <= totalNumber; index++) {
			int nextNumber = previousNumber + currentNumber;
			previousNumber = currentNumber;
			currentNumber = nextNumber;
			System.out.print(" " + nextNumber);
		}
	}

}
