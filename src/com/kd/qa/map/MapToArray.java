package com.kd.qa.map;

import java.util.HashMap;
import java.util.Map;

public class MapToArray {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("aa", 10);
		map.put("bb", 20);
		map.put("cc", 30);
		map.put("dd", 40);

		String[] keys = map.keySet().toArray(new String[map.keySet().size()]); // returns an array of keys
		Integer[] values = map.values().toArray(new Integer[map.keySet().size()]); // returns an array of values

		// Cann't create a generic array of Map.Entry<String,Integer>
		// Entry<String, Integer>[] entries = (Entry<String, Integer>[]) map.entrySet().toArray(new Entry<String, Integer>[map.keySet().size()]);

		for (String key : keys)
			System.out.println(key);
		for (Integer value : values)
			System.out.println(value);

	}

}
