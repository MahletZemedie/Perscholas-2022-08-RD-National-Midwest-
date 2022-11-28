package com.perscholas.java_basics;
import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie
 * Date : 11/28/2022
 * @see the question <a href="https://www.hackerrank.com/challenges/java-strings-introduction/problem" </a>
 */
public class JavaStringsIntroduction {
	
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String A=sc.next();
        System.out.println("Enter the second  string: ");
        String B=sc.next();
        
        
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        System.out.println(sum);
        
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else System.out.println("No");
        
        
        String str = A.substring(0,1).toUpperCase() + A.substring(1) + " " +
                    B.substring(0,1).toUpperCase() + B.substring(1) ;
    
        System.out.println(str);
    }

}
