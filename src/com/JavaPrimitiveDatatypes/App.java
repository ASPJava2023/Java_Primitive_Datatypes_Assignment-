
/*
 * Assignment 1: Calculate Sum and Average
Create a Java program that calculates the sum and 
average of two integers and displays the results.
 * 
 */
package com.JavaPrimitiveDatatypes;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1;
		int number2;
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter your first Number ");
		number1 = Sc.nextInt();
		
		System.out.println("Enter your second Number ");
		number2 = Sc.nextInt();
		System.out.println("The first Number is " + number1);
		System.out.println("The Second Number is " + number2);
		int sum = Methods.sum(number1, number2);
		System.out.println("The Sum of given number is " + sum);
		int average = Methods.average(number1, number2);
		System.out.println("The Average of given number is " + average);
		Sc.close();
	}

}
