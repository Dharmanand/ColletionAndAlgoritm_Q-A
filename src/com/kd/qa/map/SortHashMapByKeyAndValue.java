package com.kd.qa.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// How to sort HashMap by key and value in Java - Hashtable, Map Example Tutorial

public class SortHashMapByKeyAndValue {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(101, 1001);
		map.put(108, 1008);
		map.put(102, 1002);
		map.put(109, 1009);
		map.put(105, 1005);
		map.put(104, 1004);
		System.out.println(getSortedMapByKey(map));
	}

	public static Map<Integer, Integer> getSortedMapByKey(Map<Integer, Integer> map) {

		LinkedHashMap<Integer, Integer> temp = new LinkedHashMap<>();
		
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);

		for (Integer i : list)
			temp.put(i, map.get(i));
		return temp;
	}
}
