package com.perscholas.java_basics;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie 
 * Date : 11/29/2022
 */
public class PracticeAssignmentArray {

	public static void main(String[] args) {
		
	/*
	 * Write a program that creates an array of integers with a length of 3. 
	 * Assign the values 1, 2, and 3 to the indexes. Print out each array element.
	 */
		
	int arr []=new int [3];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	
	for(int i = 0; i<arr.length; i++) {
		System.out.println("Value at index " + i + " is " + arr[i]);
	}
	System.out.println("--------------------------------------------------------------------------");
	/*Write a program that returns the middle element in an array. 
	 * Give the following values to the integer array: {13, 5, 7, 68, 2} and 
	 * produce the following output: 7
	 */
	int arr2 [] = new int [5];
	arr2[0]= 13; arr2[1] = 5; arr2[2] = 7; arr2[3] = 68 ; arr2[4] = 2;
	
	int x = arr2[(arr2.length)/2];
	System.out.println("The middle element of the given array is " + x + ".");
	
	System.out.println("--------------------------------------------------------------------------");
	
	/*
	 * Write a program that creates an array of String type and initializes it with the strings 
	 * “red”, “green”, “blue” and “yellow”. Print out the array length. 
	 * Make a copy using the clone( ) method. 
	 * Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
	 */
	
	String str [] = new String [4];
	str[0] = "red"; str[1]="green"; str[2] = "blue"; str[3]="yellow";
	
	System.out.println("The length of the array is " + str.length);
	
	String str2 [] = str.clone();
		System.out.println(Arrays.toString(str2));
	
	
	System.out.println("--------------------------------------------------------------------------");
	/*
	 * Write a program that creates an integer array with 5 elements (i.e., numbers). 
	 * The numbers can be any integers.  
	 * Print out the value at the first index and the last index using length - 1 as the index. 
	 * Now try printing the value at index = length ( e.g., myArray[myArray.length ] ). 
	 *  Notice the type of exception which is produced. Now try to assign a value to the array index 5. 
	 *  You should get the same type of exception.
	 */
	
	int myArray [] = new int [5];
	myArray[0]= 13; myArray[1] = 5; myArray[2] = 7; myArray[3] = 68 ; myArray[4] = 2;
	System.out.println("The value at the first index is " + myArray[0]);
	System.out.println("The value at the last index is " + myArray[myArray.length-1]);
	//System.out.println("Throw an array out of bounds exception " + myArray[myArray.length]);
	//myArray[5]=45;
	//System.out.println("Throw an array out of bounds exception " + myArray[5]);
	
	System.out.println("--------------------------------------------------------------------------");
	
	/*
	 *Write a program where you create an integer array with a length of 5. 
	 *Loop through the array and assign the value of the loop control variable 
	 *(e.g., i) to the corresponding index in the array.
 
	 */
	
	int arr3[] = new int[5];
	
	for(int i = 0; i<arr3.length; i++) {
		arr3[i] = i;
		System.out.println("The value assigned to index " + i + " from the loop control variable is " + arr3[i]);
	}
	
	System.out.println("--------------------------------------------------------------------------");
	
	/*
	 * Write a program where you create an integer array of 5 numbers. 
	 * Loop through the array and assign the value of the loop control variable
	 * multiplied by 2 to the corresponding index in the array.
	 */
	
	int arr4[] = new int [5];
		for(int i =0; i<arr4.length; i++) {
			arr4[i] = i * 2;
			System.out.println("The value assigned to index " + i + " from the loop control variable multiplied by 2 is " + arr4[i]);
		}
	
	System.out.println("--------------------------------------------------------------------------");
	
	/*
	 * Write a program where you create an array of 5 elements. 
	 * Loop through the array and print the value of each element, 
	 * except for the middle (index 2) element.
	 */
	
	int arr5 [] = new int[5];
	arr5[0]= 13; arr5[1] = 5; arr5[2] = 7; arr5[3] = 68 ; arr5[4] = 2;
	int mid = (arr5.length)/2;
	for(int i = 0; i<arr5.length; i++) {
		if(arr5[i]!=arr5[(arr5.length)/2]) 
		System.out.println("The value at Index " + i + " " + arr5[i]);
	}
	System.out.println("--------------------------------------------------------------------------");
	
	/*
	 * Write a program that creates a String array of 5 elements 
	 * and swaps the first element with the middle element without creating a new array.
	 */
	String str3 [] = new String[5];
	str3[0] = "red"; str3[1]="green"; str3[2] = "blue"; str3[3]="yellow"; str3[4]="purple";
//	for(int i=0; i<str3.length; i++) {
//		System.out.println("Before swapping the value at index " + i + " is " + str3[i]);
//	}
	
	System.out.println("Before swapping");
	System.out.println(Arrays.toString(str3));
	
	String temp = str3[0];
	str3[0] = str3[1];
	str3[1] = temp;
	
	System.out.println("After swapping");
	System.out.println(Arrays.toString(str3));
	
	
	System.out.println("--------------------------------------------------------------------------");
	/*Write a program to sort the following int array in ascending order: 
	 * {4, 2, 9, 13, 1, 0}. 
	 * Print the array in ascending order, and print the smallest and the largest element of the array. 
	 * The output will look like the following: Array in ascending order: 0, 1, 2, 4, 9, 13
		The smallest number is 0
		The biggest number is 13
	 */
	
	int [] str4 = new int[6];
	str4[0]=4; str4[1]=2; str4[2]=9;str4[3]=13; str4[4]=1;str4[5]=0;
	Arrays.sort(str4);
	System.out.println("Array in ascending order " + Arrays.toString(str4));
	System.out.println("The smallest number is " + str4[0]);
	System.out.println("The biggest number is " + str4[str4.length-1]);
	
	System.out.println("--------------------------------------------------------------------------");
	/*
	 * Create an array that includes an integer, 3 strings, and 1 double. Print the array.
	 */
	Object mixed [] = new Object[5];
	mixed[0]= 25;
	mixed[1] = "green";
	mixed[2] = "yellow";
	mixed[3] = "red";
	mixed[4] = 42.254;
	
	System.out.println("Array with different data type " + Arrays.toString(mixed));
	
	System.out.println("--------------------------------------------------------------------------");
	
	/*
	 * Write some Java code that asks the user how many favorite things they have. 
	 * Based on their answer, you should create a String array of the correct size. 
	 * Then ask the user to enter the things and store them in the array you created. 
	 * Finally, print out the contents of the array.
		Example
		How many favorite things do you have?
		7
		Enter your thing: phone
		Enter your thing: tv
		Enter your thing: xbox
		Enter your thing: wine
		Enter your thing: beer
		Enter your thing: sofa
		Enter your thing: book
		Your favorite  things are:
		phone tv xbox wine beer sofa book
	 * 
	 */
	
		Scanner scan = new Scanner(System.in);
		System.out.println("How many favorite things do you have?");
		int input = scan.nextInt();
		String favourite [] = new String[input];
		
		for(int i=0; i<input; i++) {
		System.out.println("Enter your thing:");
		String input2 = scan.next();
		favourite[i] = input2;
		}
		System.out.println("Your favorite things are: ");
		for(String print: favourite) {
			System.out.print(print + ", ");
		}
	
	
	}

}
