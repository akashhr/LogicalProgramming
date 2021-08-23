package com.bridgelabz.logicalprogramming;
import java.util.*;

public class StopWatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int userchoice;
		long startTime = 0;
		long stopTime;
		long timeElapsed;

		while (true) {

			System.out.println("Enter:\n1 - START\n2 - STOP\n3 - EXIT\n");
			userchoice = sc.nextInt();
			switch (userchoice) {
			case 1:
				startTime = System.currentTimeMillis();
				System.out.println("Started At: " + startTime + " ms");
				break;

			case 2:
				stopTime = System.currentTimeMillis();
				System.out.println("Stopped At: " + stopTime + " ms");
				timeElapsed = stopTime - startTime;
				System.out.println("Elapsed Time: " + timeElapsed + " ms");
				break;

			case 3:
				System.exit(0);
			}
			sc.close();
		}
		
		
	}

}
