package com.bridgelabz.dayoneproblems;

public class LargestElementOfArray {
	public static void main(String[] args) {
		int Classroom[]= {20,30,40,50,60,70};
		int max = Classroom[0];
		
		for(int i=1; i < Classroom.length; i++)
		{
			 if(Classroom[i] > max)
			 {
	                max = Classroom[i];
		     }
	    }
		System.out.println("Here is the largest element of array: " +max);
	}
}
