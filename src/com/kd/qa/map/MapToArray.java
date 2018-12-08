package com.kd.qa.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapToArray {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		String[] keys = (String[]) map.keySet().toArray(); // returns an array of keys
		Integer[] values = (Integer[]) map.values().toArray(); // returns an array of values
		Entry<String, Integer>[] entries = (Entry<String, Integer>[]) map.entrySet().toArray(); // returns an array of
																								// Entries.

	}

}
