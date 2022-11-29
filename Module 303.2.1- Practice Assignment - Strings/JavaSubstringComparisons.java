package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie
 * Date : 11/28/2022
 * @see the question <a href="https://www.hackerrank.com/challenges/java-string-compare/problem" </a>
 */

public class JavaSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        smallest = largest = s.substring(0, k);
        for (int i=1; i<s.length()-k+1; i++) {
        String substr = s.substring(i, i+k);
        if (smallest.compareTo(substr) > 0)
            smallest = substr;
        if (largest.compareTo(substr) < 0)
            largest = substr;
    }

        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scan.next();
        System.out.println("Enter an integer");
        int k = scan.nextInt();
        scan.close();
        System.out.println("Lexicographically-ordered substrings:- ");
        System.out.println(getSmallestAndLargest(s, k));
    }

}
