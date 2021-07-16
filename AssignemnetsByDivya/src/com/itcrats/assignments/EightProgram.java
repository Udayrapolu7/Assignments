package com.itcrats.assignments;

import java.io.*;
import java.util.Scanner;

public class EightProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File Myfile = new File("udayrapolu.txt");
		Myfile.createNewFile();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the word want to search");
       String words = sc.next();
       boolean valid = false;
       int count = 0;    
       System.out.println("Contents of the line");
       Scanner scan = new Scanner(new FileInputStream(Myfile));
       while(scan.hasNextLine())
       {
    	   String line = scan.nextLine();
    	   System.out.println(line);
    	   if(line.indexOf(words)!=-1) {
               valid = true;
               count = count+1;
            }
         }
         if(valid) {
            System.out.println("File contains the specified word is :  "+words);
            System.out.println("Number of occurrences is: "+count);
         } else {
            System.out.println("File does not contain the specified word");
         }
       }
	}


