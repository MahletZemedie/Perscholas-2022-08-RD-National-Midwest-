package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie 
 * Date : 11/29/2022
 */
public class ControlFlowConditionalStatements {

	public static void main(String[] args) {

		/*
		 * 1. Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if statement to print out “Less than 10” if x is less than 10.
		 * Change x to equal 15, and notice the result (console should not display
		 * anything).
		 */

		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		}

		/*
		 * 2. Write a program that declares 1 integer variable x, and then assigns 7 to
		 * it. Write an if-else statement that prints out “Less than 10” if x is less
		 * than 10, and “Greater than 10” if x is greater than 10. Change x to 15 and
		 * notice the result.
		 */

		int x2 = 7;
		if (x2 < 10) {
			System.out.println("Less than 10");
		} else if (x2 > 10) {
			System.out.println("Greater than 10");
		}

		/*
		 * 3. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else-if statement that prints out “Less than 10” if x is less
		 * than 10; “Between 10 and 20” if x is greater than 10 but less than 20, and
		 * “Greater than or equal to 20” if x is greater than or equal to 20. Change x
		 * to 50 and notice the result.
		 */

		int x3 = 15;
		if (x3 < 10) {
			System.out.println("Less than 10");
		} else if (x3 > 10 & x3 < 20) {
			System.out.println("Between 10 and 20");
		} else if (x3 >= 20) {
			System.out.println("Greater than or equal to 20");
		}

		/*
		 * 4. Write a program that declares 1 integer variable x, and then assigns 15 to
		 * it. Write an if-else statement that prints “Out of range” if the number is
		 * less than 10 or greater than 20 and prints “In range” if the number is
		 * between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the
		 * result.
		 */
		int x4 = 15;
		if (x4 < 10 || x4 > 20) {
			System.out.println("Out of range");
		} else if (x4 >= 10 & x4 <= 20) {
			System.out.println("in range");
		}

		/*
		 * 5. Write a program that uses if-else-if statements to print out grades A, B,
		 * C, D, F according to the following criteria: A: 90-100 B: 80-89 C: 70-79 D:
		 * 60-69 F: <60 Use the Scanner class to accept a number score from the user to
		 * determine the letter grade. Print out “Score out of range” if the score is
		 * less than 0 or greater than 100.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to see your letter grade");
		int s = scan.nextInt();

		if (s <= 100 && s >= 90) {
			System.out.println("A");
		} else if (s <= 89 && s >= 80) {
			System.out.println("B");
		} else if (s <= 79 && s >= 70) {
			System.out.println("C");
		} else if (s <= 69 && s >= 60) {
			System.out.println("D");
		} else if (s < 60) {
			System.out.println("F");
		}

		/*
		 * 6. Write a program that accepts an integer between 1 and 7 from the user. Use
		 * a switch statement to print out the corresponding weekday. Print “Out of
		 * range” if the number is less than 1 or greater than 7. Do not forget to
		 * include “break” statements in each of your cases.
		 */

		Scanner scan1 = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 7 to see days of the week");
		int days = scan1.nextInt();
		switch (days) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Out of range");
			break;

		}
		/*
		 * Create a program that lets the users input their filing status and income.
		 * Display how much tax the user would have to pay according to status and
		 * income. The U.S. federal personal income tax is calculated based on the
		 * filing status and taxable income. There are four filing statuses: Single,
		 * Married Filing Jointly, Married Filing Separately, and Head of Household. The
		 * tax rates for 2009 are shown below.
		 * 
		 */

		Scanner scan7 = new Scanner(System.in);

		System.out.println("Please choose your filling status");
		System.out.println("1. Single");
		System.out.println("2. Married Filing Jointly (Qualifying Widow(er) ");
		System.out.println("3. Married Filing Separately");
		System.out.println("4. Head of Household");

		int fillingStatus = scan7.nextInt();

		System.out.println("Please enter your income");
		int income = scan7.nextInt();

		while (fillingStatus == 1) {
			if (income >= 0 && income <= 8350) {
				System.out.println("You will pay 10%");
				break;
			} else if (income >= 8351 && income <= 33950) {
				System.out.println("You will pay 15%");
				break;
			} else if (income >= 33951 && income <= 82250) {
				System.out.println("You will pay 25%");
				break;
			} else if (income >= 82251 && income <= 171550) {
				System.out.println("You will pay 28%");
				break;
			} else if (income >= 171551 && income <= 372950) {
				System.out.println("You will pay 33%");
				break;
			} else if (income >= 372951) {
				System.out.println("You will pay 35%");
				break;
			}
		}

		while (fillingStatus == 2) {
			if (income >= 0 && income <= 16700) {
				System.out.println("You will pay 10%");
				break;
			} else if (income >= 16701 && income <= 67900) {
				System.out.println("You will pay 15%");
				break;
			} else if (income >= 67901 && income <= 137050) {
				System.out.println("You will pay 25%");
				break;
			} else if (income >= 137051 && income <= 208850) {
				System.out.println("You will pay 28%");
				break;
			} else if (income >= 208851 && income <= 372950) {
				System.out.println("You will pay 33%");
				break;
			} else if (income >= 372951) {
				System.out.println("You will pay 35%");
				break;
			}

		}

		while (fillingStatus == 3) {
			if (income >= 0 && income <= 8350) {
				System.out.println("You will pay 10%");
				break;
			} else if (income >= 8351 && income <= 33950) {
				System.out.println("You will pay 15%");
				break;
			} else if (income >= 33951 && income <= 68525) {
				System.out.println("You will pay 25%");
				break;
			} else if (income >= 68526 && income <= 104425) {
				System.out.println("You will pay 28%");
				break;
			} else if (income >= 104426 && income <= 186475) {
				System.out.println("You will pay 33%");
				break;
			} else if (income >= 186476) {
				System.out.println("You will pay 35%");
				break;
			}

		}

		while (fillingStatus == 4) {
			if (income >= 0 && income <= 11950) {
				System.out.println("You will pay 10%");
				break;
			} else if (income >= 11951 && income <= 45500) {
				System.out.println("You will pay 15%");
				break;
			} else if (income >= 45501 && income <= 117450) {
				System.out.println("You will pay 25%");
				break;
			} else if (income >= 117451 && income <= 190200) {
				System.out.println("You will pay 28%");
				break;
			} else if (income >= 190201 && income <= 372950) {
				System.out.println("You will pay 33%");
				break;
			} else if (income >= 372951) {
				System.out.println("You will pay 35%");
				break;
			}

		}

	}

}
