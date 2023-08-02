package com.prowings.hashmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IterateHashMap {
	
	public static void main(String[] args) 
	{
		
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("Krishna");
		al1.add("Ram");
		al1.add("Narshimha");
		al1.add("Vaman");
		
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("Vasudev");
		al2.add("Dashrath");
		al2.add("Parlhad");
		al2.add("Kashyapa");
		
		HashMap<String, ArrayList<String>> hs = new HashMap<>();
		
		hs.put("A", al1);
		hs.put("B", al2);
		
		System.out.println(hs);
		
		Set<String> set = hs.keySet();
		System.out.println("Iterating Keys using keySet()....");
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Iterating Values using values()....");
		
		Collection<ArrayList<String>> val =  hs.values();
		
		for(List<String> list :val) {
			System.out.println(list);
			
			Iterator<String> itrVal = list.iterator();
			
			while(itrVal.hasNext())
			{
				System.out.println(itrVal.next());
			}
		}
		
//		
//		Iterator<ArrayList<String>> itrVal = val.iterator();
//		
//		while(itrVal.hasNext()) {
//			System.out.println(itrVal.next());
//		}
		
	}
}