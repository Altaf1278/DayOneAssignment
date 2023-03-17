package com.bridgelabz.operatorprograms;

import java.util.Scanner;

public class EnterTwoNumbers {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter any number");
		int a =input.nextInt();
		System.out.print("enter any number");
		int b =input.nextInt();
		System.out.print("enter any number");
		int c =input.nextInt();
		
		int result1 = a + b * c;
	    int result2 = c + a / b;
	    int result3 = a % b + c;
	    int result4 = a * b + c;
	    
	    System.out.println("Answer of question 1 :" + result1);
	    System.out.println("Answer of question 2 :" + result2);
	    System.out.println(" Answer of question 3 :" + result3);
	    System.out.println(" Answer of question 4 :" + result4);
	}
}
