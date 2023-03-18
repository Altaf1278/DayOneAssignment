package com.bridgelabz.dayoneproblems;

import java.util.Arrays;

public class SortingElementOfArray {
	public static void main(String[] args) {
		 int[] rollno = {9,8,7,2,4,5,3,1,10};
	     System.out.println("Original array: " + Arrays.toString(rollno));
	     // sorting arrays in ascending order
	     Arrays.sort(rollno);
	     System.out.println("Array in ascending order: " + Arrays.toString(rollno));
	}
}
