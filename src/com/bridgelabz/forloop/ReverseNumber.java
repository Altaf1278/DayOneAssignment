package com.bridgelabz.forloop;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        int reversed = 0;
        for (int i = n; i != 0; i/=10) 
        {
            reversed = reversed * 10 + i % 10;
        }
        System.out.println("The reversed integer is: " + reversed);
	}
}
