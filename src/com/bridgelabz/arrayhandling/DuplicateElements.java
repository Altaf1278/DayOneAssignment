package com.bridgelabz.dayoneproblems;

public class DuplicateElements {
	public static void main(String[] args) {
		int Classroom[]= {20,30,40,50,60,70,70,20,90,100,100};
		System.out.println("We have to print duplicate elements of array: ");
		for (int i=0; i<Classroom.length; i++)
		{
			for (int j = i+1; j < Classroom.length; j++)
			{
				if(Classroom[i] == Classroom[j])
				{
					System.out.println(Classroom[j]);
				}
			}
		}
	}
}
