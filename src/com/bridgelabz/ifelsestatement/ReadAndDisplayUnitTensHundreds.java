package com.bridgelabz.ifelsestatement;

import java.util.Scanner;

public class ReadAndDisplayUnitTensHundreds {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number in Unit,Tens,Hundred,Thousand only: ");
		int number = input.nextInt();	  
		  if (number == 1) 
		  {
			  int unit = number % 10;
	          System.out.println("Unit" +unit);
	      } 
		  else if (number == 10) 
		  {
			  int ten = (number / 10) % 10; 
	          System.out.println("Ten" + ten);
	      } 
		  else if (number == 100) 
		  {
			  int hundred = (number / 100) % 10;
	          System.out.println("Hundred" +hundred);
	      } 
		  else if (number == 1000) 
		  {
			  int thousand = (number / 1000) % 10;
	          System.out.println("Thousand" +thousand);
	      } 
		  else 
		  {
	          System.out.println("Error...");
	      }	 
	   }

}
