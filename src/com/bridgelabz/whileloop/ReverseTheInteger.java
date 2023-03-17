package com.bridgelabz.whileloop;

import java.util.Scanner;

public class ReverseTheInteger {
	public static void main(String[] args) {
		
	
	      
		int n, reversenumber=0, remainder;
		/* Here n is a integer variable
		 * reverasenumber is a variable initialized to zero
		 * 'remainder' is also a variable use to store remainder of n when it is divided by 10
		 * while (n!=0) will create a loop that will continue exe till the var 'n' is ne 0
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter The Number");
		n=input.nextInt();
		
		while (n !=0)
		{
			remainder=n%10;
			reversenumber=reversenumber *10 + remainder;
			n /=10;
		}
		
		System.out.print("The Reverse Number is: " +reversenumber);
	}

}
