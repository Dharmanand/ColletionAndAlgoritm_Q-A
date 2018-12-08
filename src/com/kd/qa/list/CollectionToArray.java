package com.kd.qa.list;

import java.util.ArrayList;
import java.util.Collection;

//	Converting Collection to Array.

public class CollectionToArray {

	public static void main(String[] args) {

		Collection<String> colle = new ArrayList<String>();
		
		colle.add("India");
		colle.add("Switzerland");
		colle.add("Italy");
		colle.add("France");
		
		String [] countries = colle.toArray(new String[colle.size()]);
		
		for(String str: countries) {
			System.out.println(str);
		}
		System.out.println("---------------");
	}
	
}
