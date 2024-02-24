package com.prowings.hashset;

import java.util.HashMap;
import java.util.Map;

public class FindKeyUsingValue {
	
	public static void main(String[] args) 
	{
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("snehal", 12);
		hm.put("vaishali", 14);
		hm.put("Anushri", 13);
		hm.put("Anushrii", 13);
		System.out.println(hm);
		
		Integer val = 15;
		String key = null;
		
		for(Map.Entry<String, Integer> m : hm.entrySet() )
		{
			
			if(m.getValue().equals(val))
			{
				key = m.getKey();
				break;
			}
				
		}
		if(key != null)
			System.out.println(key);
		else
			System.out.println("Key is not present");
	}
}