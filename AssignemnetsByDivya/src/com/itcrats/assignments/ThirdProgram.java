package com.itcrats.assignments;

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "king is always  king and is wife is kings wife is king";
        int count;
		s = s.toLowerCase();
        String words[] = s.split(" ");
        //printing the size 
        System.out.println("size of words : "+words.length);
        // printing words 
        for(int i =0;i<words.length;i++)
        {
        	System.out.print(words[i]+" ,");
        }
        System.out.println("");
        System.out.println("Duplicate words are");
        for (int i =0;i<words.length;i++)
        {
        	count = 1;
        	for(int j =i+1;j<words.length;j++ )
        	{
        		if(words[i].equals(words[j]))
        		{
        			count++;
        			words[j] = "0";
        		}
        		
        	}
        	if(count>1 && words[i]!="0")
        	{
        		System.out.println(words[i]+":"+count);
        	}
        }
        
	}
}

