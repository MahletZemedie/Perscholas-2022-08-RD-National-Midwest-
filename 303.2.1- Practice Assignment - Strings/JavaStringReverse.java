package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie
 * Date : 11/28/2022
 * @see the question <a href="https://www.hackerrank.com/challenges/java-string-reverse/problem" </a>
 */

public class JavaStringReverse {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String A=sc.next();
        
        /* Enter your code here. Print output to STDOUT. */
        char ch;
        String nstr= "";
        for(int i=0; i<A.length(); i++){
            
            
                ch= A.charAt(i); //extracts each character
                nstr= ch+nstr;
            
        }
        if(nstr.equals(A)){
                    System.out.println("Yes, It is a palindrome");
                }else{
                    System.out.println("No, It is not a palindrome");
                }
    }

}
