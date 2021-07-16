package com.itcrats.assignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SixthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[] = {12,15,78,92,100,25,14};
          int size =  arr.length;
          System.out.println("Given Array is ");
          for(int i =0; i<arr.length;i++)
          {
    
        	 System.out.print(arr[i]+" "); 
        	
          }
          System.out.println();
          Arrays.sort(arr);
          System.out.println("Sorted Arrays is ::"+Arrays.toString(arr));
           int res = arr[size-2];
           System.out.println("Second largst number is : "+res);
         
                  
	}

}
