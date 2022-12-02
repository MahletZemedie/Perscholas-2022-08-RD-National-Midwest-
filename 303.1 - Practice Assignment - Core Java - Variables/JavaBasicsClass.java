/*
 * Written by : Mahlet Zemedie
 * Date : 11/22/2022
 * Core Java - Variables
 * 
 */

package com.perscholas.java_basics;

public class JavaBasicsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int m = 5;
		int sum = n + m;
		System.out.println(sum);
		
		double x1 = 10.5;
		double y1 = 5.0;
		double sum1 = x1 + y1;
		System.out.println(sum1);
		
		
		int a = 3;
		double b = 3.0;
		double c = a + b;
		System.out.println(c);
		
		
		int d = 5;
		int e = 2;
		int div = d/e;
		System.out.println(div);
		
		double z = 5D/2D;
		System.out.println(z);
		
		
		double d1 = 15.5;
		double d2 = 5.5;
		double d3 = d1/d2;
		System.out.println(d3);
		System.out.println((int)d3);
		
		
		int x =5;
		int y = 6;
		int q = y / x ;
		
		System.out.println(q);
		System.out.println((double) y/x);
		
		
		double tea = 2.35;
		double coffee = 4.25;
		double cake = 8.56;
		
		double subtotal;
		double totalSale;
		
		
		double order_1 = 3 * tea;
		double order_2 = 4 * coffee;
		double order_3 = 2 * cake;
		
		
		subtotal = order_1 + order_2 + order_3;
		
		final int salesTax = 15;
		
		
		
		totalSale = subtotal +(subtotal * salesTax)/100 ;
		
		System.out.println("subtotal: " + subtotal);
		System.out.println("total_sale: " +
				(Math.round(totalSale * 100d)/100d));
		
		
		
		
		
	}
	
}