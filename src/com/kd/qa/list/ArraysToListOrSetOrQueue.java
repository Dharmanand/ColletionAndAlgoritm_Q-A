package com.kd.qa.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ArraysToListOrSetOrQueue {

	public static void main(String[] args) {
		String[] str = new String[] { "one", "two", "three", "one" };

//		Array to List
		List<String> list = Arrays.asList(str);

//		Array To Set
		Set<String> set = new HashSet<>(Arrays.asList(str));

//		Array To Queue
		Queue<String> queue = new java.util.LinkedList<String>(Arrays.asList(str));

		/*
		 * In Java 9+, if unmodifiable set is ok:
		 * 
		 * Set<T> mySet = Set.of(someArray);
		 * 
		 * In Java 10+, the generic type parameter can be inferred from the arrays
		 * component type:
		 * 
		 * var mySet = Set.of(someArray);
		 */
	}

}
