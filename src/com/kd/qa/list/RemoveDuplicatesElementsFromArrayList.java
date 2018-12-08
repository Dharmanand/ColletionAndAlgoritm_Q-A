package com.kd.qa.list;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesElementsFromArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(102);
		list.add(103);
		list.add(102);
		list.add(101);
		list.add(101);
		
		System.out.println("duplicate List: "+list);
//		Here LinkedHashSet maintains the insertion order
		list = new ArrayList<>(new LinkedHashSet<>(list));
		System.out.println("removed duplicates from List: "+list);
		
	}

}
