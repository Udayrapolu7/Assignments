package com.itcrats.assignments;

import java.util.Scanner;

public class EleventhProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("how many rows you want to print");
		int n = sc.nextInt();
		System.out.println("Here is your pattern");
		
		  for (int i = 1; i <= n; i++) 
		  {
			  System.out.println();
			  for (int j = 1; j <= i; j++) 
			  {
				  System.out.print("* ");
			  }
			  
			  
		  }
		  sc.close();

	}

}
