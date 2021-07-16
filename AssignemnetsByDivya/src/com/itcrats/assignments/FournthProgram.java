package com.itcrats.assignments;

import java.util.LinkedHashMap;
import java.util.Map;

//How to get distinct characters and their count in a String?

public class FournthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method s
			String str="abcdAbcdAbcd";
			Map <Character, String> map=new LinkedHashMap<Character, String>();
			
			for(int i=0;i<str.length();i++)
			{
			String temp=map.get(str.charAt(i));
				if(temp==null)
				{
					map.put(str.charAt(i), "1");
				}
				else
				{
					map.put(str.charAt(i), (Integer.parseInt(""+map.get(str.charAt(i)))+1)+"");
				}
			}
			
			System.err.println(map);
		

	}

}
