package com.perscholas.practiceSBA;

/*
 * @author - Mahlet Zemedie
 * Date- 12/13/2022
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class Lamda {

	public static void main(String[] args) {
		
		
		/* Use three different forms of a  lambda expression in the ArrayList's forEach()
		 *  method to print every item in the list:
		 */
			ArrayList<String> names = new ArrayList<>();

		   String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
		   Collections.addAll(names, firstName);
		   
		   //1
		   names.forEach (name -> {  System.out.println (name);    } );
		   System.out.println("---------");
		   
		   //2
		  Consumer<String> lambdaExpression = x -> System.out.println(x);
		  names.forEach(lambdaExpression);
		  
		  System.out.println("---------");
		  
		  //3
		  Arrays.stream(firstName).forEach(x -> System.out.println(x));
		  System.out.println("---------");
		  /*
		   * 2. Using any of the three different forms of a  lambda expression 
		   * list above print every item in the list with their index. 
		   * Hint you can use the index.of method from Class ArrayList. 
		   */
		  names.forEach((name -> System.out.println(names.indexOf(name) + " " + name)));
		  
		  System.out.println("---------");
		  
		  
		  /*
		   * 3. Using any of the three different forms of a  lambda expression 
		   * list above print every item in the list in capital letters. 
		   */
		  names.forEach((name -> System.out.println(name.toUpperCase())));
		  System.out.println("---------");
		  
		  
		  //texting Question 4 and 5
		  MainRunner mainRunner = new MainRunner();
			mainRunner.add.addSub(5,2);
			System.out.println("Adding the two numbers: "+ mainRunner.add.addSub(5,2));
			System.out.println("Subtract the two numbers: "+ mainRunner.sub.addSub(5,2));
		  
		  

		}
	}
@FunctionalInterface
interface staticMethods{
	
	static void methodOne() {
		String c = "m";
		System.out.println(c.toLowerCase());
	}
	 void methodTwo();
}

class TestStaticMethod {

	
	
	staticMethods s = new staticMethods() {
		
		@Override
		public void methodTwo() {

			String c = "m";
			System.out.println(c.toUpperCase());
			
		}
		
	};
	
}

/*
 *  Create a functional interface called  AddTwoNumbers  with a method called add. 
 *  The datatype for the method is of type Integer and the parameters are two ints. 
 *  Use lambdas expressions to add the two values together. 

				Example: 
				(parameter) -> expression
				(parameter) ->{ expression}
				AddTwoNumbers numbers = Use one of the above lambdas expressions ;
				System.out.println(numbers.add(#,#));

 */

@FunctionalInterface
interface AddTwoNumbers{
	 int addSub(int a, int b);
	 
}

class MainRunner{
	
	
	AddTwoNumbers add = new AddTwoNumbers() {
		@Override
		public int addSub(int a, int b) {
			return a+b;
		}
	};
	
	// Change your lambda expression to subtract the two numbers instead of adding them.

	
	AddTwoNumbers sub = new AddTwoNumbers() {
		@Override
		public int addSub(int a, int b) {
			return a-b;
		}
	};
	
}
	



