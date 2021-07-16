package com.itcrats.assignments;
import java.util.Arrays;
public class TwelvethProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initilazing threee integer arrays
	      Object array1[] = new Object[] { 1,2,3,4,5,6,7};
		Object  array2[] = new Object [] {4,5,6,7,8,9,10};
		Object array3[] = new Object[] {1,2,3,4,5,6,7};
		
		boolean  checking1 = Arrays.equals(array1, array2);
		System.out.println("array1 and array2 are equal ? "+checking1);
		boolean  checking2 = Arrays.equals(array1, array3);
		System.out.println("array1 and array3 are equal ? "+checking2);
		System.out.println("*************************************************************");
		// regular method intilizing two arrays
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		
		boolean checking = Arrays.equals(arr1, arr2);
		System.out.println("array1 and array3 are equal :"+checking);

	}

}
