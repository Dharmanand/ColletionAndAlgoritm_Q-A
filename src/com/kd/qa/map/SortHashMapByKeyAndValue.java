package com.kd.qa.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// How to sort HashMap by key and value in Java - Hashtable, Map Example Tutorial

public class SortHashMapByKeyAndValue {

	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(101, 1009);
		map.put(108, 1001);
		map.put(102, 1003);
		map.put(109, 1009);
		map.put(105, 1004);
		map.put(104, 1005);
		System.out.println("UnSortedMap : "+map);
		System.out.println("getSortedMapByKey : "+getSortedMapByKey(map));
		System.out.println("getSortedMapByValue : "+getSortedMapByValue(map));
	}

//	Sorted a Map by Key
	
	public static Map<Integer, Integer> getSortedMapByKey(Map<Integer, Integer> map) {

		LinkedHashMap<Integer, Integer> temp = new LinkedHashMap<>();
		List<Integer> list = new ArrayList<>(map.keySet());
		Collections.sort(list);

		for (Integer i : list)
			temp.put(i, map.get(i));
		return temp;
	}
	
//	Sorted a Map by Value
	
	public static Map<Integer, Integer> getSortedMapByValue(Map<Integer, Integer> map) {
		
		List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
		
		for (Map.Entry<Integer, Integer> entry : list) 
			sortedMap.put(entry.getKey(), entry.getValue());
			
		
		return sortedMap;
	}
	
	
}
