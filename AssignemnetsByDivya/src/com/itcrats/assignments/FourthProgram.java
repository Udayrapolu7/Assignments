package com.itcrats.assignments;
import java.util.*;
//How do you retrieve a value associated with a given key from the HashMap and How do you get synchronized HashMap in java?
public class FourthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> list = new HashMap<Integer,String>();
		list.put(1, "apple");
		list.put(6, "banana");
		list.put(7, "orange");
		list.put(3, "poppayi");
		list.put(5, "mango");
		//printing the list
		System.out.println(list);
		// calling values by using keys
		System.out.println("the values are :"+list.get(3));
		System.out.println("the values are :"+list.get(6));
		
		Map map = Collections.synchronizedMap(list);
		Set set = map.entrySet();
		synchronized(map)
		{
			 Iterator i = set.iterator();
			 while(i.hasNext())
			 {
				 Map.Entry me = (Map.Entry)i.next();
				 System.out.print(me.getKey()+":");
				 System.out.println(me.getValue());
			
			 }
		}

		

	}

}
