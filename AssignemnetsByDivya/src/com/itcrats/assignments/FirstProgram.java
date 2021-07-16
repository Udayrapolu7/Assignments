package com.itcrats.assignments;

/*Write a program to create two int[] and print the numbers, that are missing in 1st array 
whcih is not present in 2nd array.*/
public class FirstProgram {
	
	static void findMissing(int a[], int b[],int n, int m)
	{
       for (int i =0;i< n;i++)
       {
    	   int j;
    	   for (j=0;j< m;j++)
    		   
    		   if(a[i]==b[j])
    			   break;	      			   
    		     if(j == m)
    		System.out.print(a[i]+" ");
    		   
       }

}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12 ,14,16,25,36};
		int b[] = {14,17,78,45,36};
         int n = a.length;
         int m = b.length;
         findMissing(a,b,n,m);
	}

}
