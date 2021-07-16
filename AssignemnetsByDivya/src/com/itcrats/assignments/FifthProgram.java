package com.itcrats.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

/* write a program by using all the existing methods including itarator() in set interface. */
public class FifthProgram{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Set<Object> list = new HashSet<Object>();
		//Adding Objects by Using Add method
		list.add("uday");
		list.add(1234);
		list.add('M');
		list.add("king");
		list.add(126);
		System.out.println("the added elements are :"+list);
		//Removing Elements By using remove Method
		list.remove('M');
		list.remove(126);
		System.out.println("the removed  elements are :"+list);
        //Check if the above string exists in
        // the SortedSet or not
		System.out.println("checking whther uday present in the above list or not ?:"+list.contains("uday"));
		
		 // Iterating over hash set items
        System.out.println("Iterating over set:");
        Iterator<Object> i = list.iterator();
        while (i.hasNext())
            System.out.println(i.next());


	}

}
