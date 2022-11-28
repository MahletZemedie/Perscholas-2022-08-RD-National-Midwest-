package com.perscholas.java_basics;

public class OperatorsAndNumbers {
	
	public static void main(String [] args) {
		
		/*
		 * Write the following integers in binary notation. 
		 * Do not use any Java functions or online conversion applications to calculate the answer, 
		 * as this will hinder the learning process and your understanding of the concept. 
		 * However, you may check your answers using Java methods.
		 */
		
		System.out.println("******Int to Binary******");
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(8));
		System.out.println(Integer.toBinaryString(33));
		System.out.println(Integer.toBinaryString(78));
		System.out.println(Integer.toBinaryString(787));
		System.out.println(Integer.toBinaryString(33987));
		System.out.println("--------------------------------------------------------------------------");
		
		/*
		 * Convert the following binary numbers to decimal notation. 
		 * Do not use any Java functions or online conversion applications to calculate the answer, 
		 * as this will hinder the learning process and your understanding of the concept. 
		 * However, you may check your answers using Java methods.
		 */
		
		System.out.println("******Binary to Decimal******");
		System.out.println(Integer.parseInt("0010",2));
		System.out.println(Integer.parseInt("1001",2)); 
		System.out.println(Integer.parseInt("00110100",2)); 
		System.out.println(Integer.parseInt("01110010",2)); 
		System.out.println(Integer.parseInt("001000011111" + "",2)); 
		System.out.println(Integer.parseInt("0010110001100111" + "",2)); 
		
		System.out.println("--------------------------------------------------------------------------");
		/*Write a program that declares an integer a variable x and assigns the value 2 to it 
		 * and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
		 *  Now, use the left shift operator (<<) to shift by 1 and assign the result to x. 
		 *  Before printing the results, write a comment with the predicted decimal value and binary string. 
		 *  Now, print out x in decimal form and in binary notation. Do the preceding exercise with the following values
		 */
		System.out.println("*****Binary string problem");
		System.out.println();
		
		
		int x= 2;
		//10
		System.out.println("The binary representation of " + x + " is: " + Integer.toBinaryString(x));
		//4
		x = x<<1;
		System.out.println("Left shift 2 by one positions: " + x );
		System.out.println();
		
		
		int y=9;
		//1001
		System.out.println("The binary representation of " + y + " is: " + Integer.toBinaryString(y));
		//18
		y = y<<1;
		System.out.println("Left shift 9 by one positions: " + y);
		System.out.println();
		
		int z = 88;
		//1011000
		System.out.println("The binary representation of " + z + " is: " + Integer.toBinaryString(z));
		//176
		z = z<<1;
		System.out.println("Left shift 88 by one positions: " + z);
		System.out.println();
		
		int a = 150;
		//10010110
		System.out.println("The binary representation of " + a + " is: " +Integer.toBinaryString(a));
		//22
		a = a>>2;
		System.out.println("Right shift 150 by two positions: " + a);
		System.out.println();
		
		
		int b = 225;
		//11100001
		System.out.println("The binary representation of " + b + " is: " +Integer.toBinaryString(b));
		b = b>>2;
		//56
		System.out.println("Right shift 225 by two positions: " + b);
		System.out.println();
		
		
		int c = 1555;
		//11000010011
		System.out.println("The binary representation of " + c + " is: " +Integer.toBinaryString(c));
		c = c>>2;
		//388
		System.out.println("Right shift 1555 by two positions: " + c);
		System.out.println();
		
		int d = 32456;
		//111111011001000
		System.out.println("The binary representation of " + d + " is: " +Integer.toBinaryString(d));
		d = d>>2;
		//8114
		System.out.println("Right shift 32456 by two positions: " + d);
		System.out.println("--------------------------------------------------------------------------");

		/*
		 * Write a program that declares three int variables x, y, and z.
		 *  Assign 7 to x and 17 to y. 
		 *  Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
		 *   Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
			Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y. 
			As before, write a comment that indicates what you predict the values to be before printing them out.
		 */
		
		int x1 = 7;
		int y1 = 17;
		int z1 = x1 & y1;
		 
		//111
		System.out.println("The binary representation of " + x1 + " is: " +Integer.toBinaryString(x1));
		//10001
		System.out.println("The binary representation of " + y1 + " is: " +Integer.toBinaryString(y1));
		// 1
		System.out.println("The bitwise operatpr AND(&) on 7 and 17 gives " + z1);
		
		int z2 = x1 | y1 ;
		
		//23
		System.out.println("The bitwise operatpr OR(|) on 7 and 17 gives " + z2);
		
		System.out.println("--------------------------------------------------------------------------");
		
		/*
		 * Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
		 *  Print the value before and after the increment operator.
		 */
		
		int i = 7;
		System.out.println("Value of i before increment is : " + i);
		i++;
		//8
		System.out.println("Postfix increment operator on number i gives us: " + i);
		System.out.println("--------------------------------------------------------------------------");
		
		
	/*
	 * Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times. 
	 * Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.
	 * 
	 */
		
		int j = 10;
		System.out.println("Value of j is:" + j);
		j++;
		System.out.println("value of j after incrementing is: " + j);
		j = j + 1;
		System.out.println("value of j after incrementing is: " + j);
		++j;
		System.out.println("value of j after incrementing is: " + j);
		
		System.out.println("--------------------------------------------------------------------------");
		
	/* Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y. 
	 * Create another variable sum and assign the value of ++x added to y, and print the result. 
	 * Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program. 
	 * Notice what the value of the sum is. The first configuration incremented x and then calculated the sum, 
	 * while the second configuration calculated the sum and then incremented x.
	 */
		
		int x2 = 5;
		int y2 = 8;
		int sum = ++x2 + y2;
		System.out.println("Value of x is " + x2);
		System.out.println("Value of y is " + y2);
		System.out.println("The sum of ++x and y is: " + sum);
		
		sum = x2++ + y2;
		System.out.println("The sum of x++ and y is: " + sum);
		
		
		
		
	}

}
