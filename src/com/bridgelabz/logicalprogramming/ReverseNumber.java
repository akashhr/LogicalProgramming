package com.bridgelabz.logicalprogramming;
import java.util.*;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int remainder, reversedNumber = 0;
		System.out.println("Enter the number to be reversed:");
		int numberToReverse = sc.nextInt();
		sc.close();

		while (numberToReverse > 0) {
			remainder = numberToReverse % 10;
			reversedNumber = (reversedNumber * 10) + remainder;
			numberToReverse = numberToReverse / 10;
		}

		System.out.println("The reversed Number is: " + reversedNumber);
	}

}
