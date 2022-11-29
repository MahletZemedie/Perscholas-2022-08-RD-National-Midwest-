package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie
 * Date : 11/29/2022
 */
public class ControlFlowConditionalStatements {

	public static void main(String[] args) {
		
	/*
	 * 1. Write a program that declares 1 integer variable x, and then assigns 7 to it. 
	 * Write an if statement to print out “Less than 10” if x is less than 10. 
	 * Change x to equal 15, and notice the result (console should not display anything).
	 */
		
		int x = 7;
		if(x<10) {
			System.out.println("Less than 10");
		}
		
		
	/*
	 * 2. Write a program that declares 1 integer variable x, and then assigns 7 to it. 
	 * Write an if-else statement that prints out “Less than 10” if x is less than 10, and “Greater than 10” if x is greater than 10. 
	 * Change x to 15 and notice the result.
	 */
		
		int x2 = 7;
		if(x2<10) {
			System.out.println("Less than 10");
		}else if(x2>10) {
			System.out.println("Greater than 10");
		}
		
		
		
		
		
	/*
	 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to it. 
	 * Write an if-else-if statement that prints out “Less than 10” if x is less than 10; 
	 * “Between 10 and 20” if x is greater than 10 but less than 20, 
	 * and “Greater than or equal to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
	 */
		
		int x3 = 15;
		if(x3<10) {
			System.out.println("Less than 10");
		}else if (x3>10 & x3<20) {
			System.out.println("Between 10 and 20");
		}else if(x3>=20) {
			System.out.println("Greater than or equal to 20");
		}
		
	/*
	 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to it. 
	 * Write an if-else statement that prints “Out of range” if the number is less than 10 or 
	 * greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
	 *  Change x to 5 and notice the result.
	 */
		int x4 = 15;
		if(x4<10 || x4>20) {
			System.out.println("Out of range");
		}else if(x4>=10 & x4<=20) {
			System.out.println("in range");
		}
		
	/*
	 * 5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F according to the following criteria:
					A: 90-100
					B: 80-89
					C: 70-79
					D: 60-69
					F: <60
	Use the Scanner class to accept a number score from the user to determine the letter grade. 
	Print out “Score out of range” if the score is less than 0 or greater than 100.
	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see your letter grade");
		int s = scan.nextInt();
		
		if(s<=100 && s>=90) {
			System.out.println("A");
		}else if(s<=89 && s>=80) {
			System.out.println("B");
		}else if(s<=79 && s>=70) {
			System.out.println("C");
		}else if(s<=69 && s>=60) {
			System.out.println("D");
		}else if(s<60) {
			System.out.println("F");
		}
		
		/*
		 * 6. Write a program that accepts an integer between 1 and 7 from the user. 
		 * Use a switch statement to print out the corresponding weekday. 
		 * Print “Out of range” if the number is less than 1 or greater than 7. 
		 * Do not forget to include “break” statements in each of your cases.
		 */
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 7 to see days of the week");
		int days = scan1.nextInt();
		switch(days) {
		case 1 : System.out.println("Monday");
		break;
		case 2 : System.out.println("Tuesday");
		break;
		case 3 : System.out.println("Wednesday");
		break;
		case 4 : System.out.println("Thursday");
		break;
		case 5 : System.out.println("Friday");
		break;
		case 6 : System.out.println("Saturday");
		break;
		case 7 : System.out.println("Sunday");
		break;
		default: System.out.println("Out of range");
		break;
		
		
		}
		
		

	}

}
