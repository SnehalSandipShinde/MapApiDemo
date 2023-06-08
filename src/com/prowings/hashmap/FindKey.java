package com.prowings.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindKey {

	public static void main(String[] args) 
	{
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("snehal", 12);
		hm.put("vaishali", 14);
		hm.put("Anushri", 13);
		hm.put("Anushrii", 13);
		System.out.println(hm);
		System.out.println(getKey(hm,13));
	}
	
	public static Set<String> getKey(Map<String, Integer> map, Integer value)
	{
	
		Set<String> result = new HashSet<>();
		if(map.containsValue(value)) {
			for(Map.Entry<String, Integer> entry : map.entrySet()) {
				if(value.equals(entry.getValue()))
				result.add(entry.getKey());
			}
		}
		return result;
	}
}
