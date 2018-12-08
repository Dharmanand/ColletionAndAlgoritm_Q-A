package com.kd.qa.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//	how to check if an Array contains duplicate or not in Java.

public class ArrayContainsDuplicateOrNot {

	public static void main(String[] args) {
		
		String[] withDuplicates = new String[] {"one","two","three","one"};
		
		System.out.println("The Duplicate element in Array: "+getDuplicateElementUsingList(withDuplicates));
		
	}
	
	public static String getDuplicateElementUsingSet(String[] arr) {
		
		Set<String> set = new HashSet<>(Arrays.asList(arr));
		for(String str : arr) {
			if(!set.add(str)) {
				return str;
			}
		}
		return null;
	}
	
	public static String getDuplicateElementUsingList(String[] arr) {
		
		List<String> set = Arrays.asList(arr);
		for(String str : arr) {
			if(set.contains(str)) {
				return str;
			}
		}
		return null;
	}

}
