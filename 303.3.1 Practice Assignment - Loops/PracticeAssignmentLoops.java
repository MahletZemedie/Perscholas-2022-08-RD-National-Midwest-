package com.perscholas.java_basics;

import java.util.Scanner;

public class PracticeAssignmentLoops {

	/*
	 * Question 1: Print a Multiplication Table Write a program that uses nested for
	 * loops to print a multiplication table.
	 * 
	 */
	public static void main(String[] args) {
		int tableSize = 12;
		for (int i = 1; i <= tableSize; i++) {
			for (int j = 1; j <= tableSize; j++) {
				System.out.format("%4d", i * j);
			}
			System.out.println();
		}
		

		System.out.println("--------------------------------------------------------------------------");
		

		/*
		 * Find the Greatest Common Divisor Write a program that prompts the user to
		 * enter two positive integers, and find their greatest common divisor (GCD).
		 * Examples: Enter 2 and 4. The gcd is 2. Enter 16 and 24. The gcd is 8. How do
		 * you find the gcd? Name the two input integers n1 and n2. You know number 1 is
		 * a common divisor, but it may not be the gcd. Check whether k (for k = 2, 3,
		 * 4, and so on) is a common divisor for n1 and n2, until k is greater than n1
		 * or n2.
		 * 
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a positive number: ");
		int x = scan.nextInt();
		System.out.println("Enter a positive number: ");
		int y = scan.nextInt();
		
		int gcd = 1;
		for(int i=1; i<=x; i++) {
			if (x % i == 0 && y % i == 0) {
	            gcd = i;
	        }
		}
		
		System.out.println("The gcd of " + x + " & " + y + " is: " + gcd);
		

		System.out.println("--------------------------------------------------------------------------");
		
		/*
		 * Question 3: Predict Future Tuition Suppose the tuition for a university is
		 * $10,000 for the current year and increases by 7 percent every year. In how
		 * many years will the tuition be doubled?
		 */
		
		double tuition = 10000;
		int count = 0;
		while(tuition < 20000) {
			tuition = tuition + (tuition * 0.07);
			
			count++;
		}
		System.out.println("It will take " + count + " years to double the tuition.");
	}
	
	

}
