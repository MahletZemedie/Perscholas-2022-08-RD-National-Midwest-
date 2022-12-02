package com.perscholas.java_basics;

import java.util.Scanner;

/**
 * Written by : Mahlet Zemedie
 * Date : 11/28/2022
 * @see the question <a href="https://www.hackerrank.com/challenges/java-string-tokens/problem" </a>
 */
public class JavaStringTokens {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a string");
        if(!scan.hasNext()){
            System.out.println("The number of tokens in the given string is: " + 0);
        }
        else{
        String s = scan.nextLine();
        // Write your code here.
        String [] str = s.trim().split("[ !,?._'@]+");
        System.out.println("The number of tokens in the given string is: " + str.length);
        System.out.println("Each of the " + str.length + " tokens are the followings :-" );
        for(String listofString: str){
            System.out.println(listofString);
            
        }
        }
        scan.close();
    }

}
