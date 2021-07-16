package com.itcrats.assignments;

import java.util.Scanner;

// finding Armstrong number
public class SeventhProgram {
       public static int length(int number)
       {
    	   int length = 0;
    	   while(number!=0)
    	   {
    		  double d = number%10;
    		  length = length+1;
    		  number = number/10;
    	   }
    	   return length;
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int number = sc.nextInt();
      int backup = number;
      int len = length(number);
      int results = 0;
      while(number!=0)
      {
    	  int d1 = number%10;
    	  results = results+(int)Math.pow(d1, len);
    	  number = number/10;
      }
      System.out.println(results);
      if(results == backup)
      {
    	  System.out.println("this is armstrong number");
      }
      else
      {
    	  System.out.println("this is not an  armstrong number");

      }
      
	}

}
