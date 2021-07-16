package com.itcrats.assignments;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

//write a program to add,remove,union and intersection objects from hashset in java.
public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Object> list1 = new HashSet<Object>();
        list1.addAll(Arrays.asList(12,15,16,7,10,9,"uday"));
        Set<Object> list2 = new HashSet<Object>();
        list2.addAll(Arrays.asList( 14,16,11,10,8,9,"uday"));
        System.out.println(list1);
        System.out.println(list2);
        
       //Adding two Arraylists 
       
        
    // Union of given ArrayLists
      Set<Object> union = new HashSet<Object>(list1);
      union.addAll(list2);
       System.out.println("Union of list1 and list2: "+union); 
       
      // InterSection of Given Arraylists 
       Set<Object> intersection = new HashSet<Object>(list1);
        intersection.retainAll(list2);
        System.out.println("intersection of list1 and list2: "+intersection); 
        
        // Difference of two sets 
        Set<Object> diffrence = new HashSet<Object>(list1);
        diffrence.removeAll(list2);
         System.out.println("difference of list1 and list2: "+diffrence); 
     

	}

}
