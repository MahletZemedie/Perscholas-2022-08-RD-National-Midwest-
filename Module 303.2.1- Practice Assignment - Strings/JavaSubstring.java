package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie
 * Date : 11/28/2022
 * @see the question <a href="https://www.hackerrank.com/challenges/java-substring/problem" </a>
 */

public class JavaSubstring {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string");
        String S = in.next();
        System.out.println("Please enter the starting index");
        int start = in.nextInt();
        System.out.println("Please enter the ending index");
        int end = in.nextInt();
        
        System.out.println("The substring consisting of all characters in the inclusive range from start to end is: "+S.substring(start, end));
    }

}
