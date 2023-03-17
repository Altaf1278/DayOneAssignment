package com.bridgelabz.dayoneproblems;

public class SmallestelementOfArray {
	public static void main(String[] args) {
		int Classroom[]= {20,30,40,50,60,70};
		int small = Classroom[0];
	        
	        for(int i = 1; i < Classroom.length; i++) 
	        {
	            if(Classroom[i] < small) 
	            {
	                small = Classroom[i];
	            }
	        }
		System.out.println("Here is the smallest element of array: " +small);
	}
}
