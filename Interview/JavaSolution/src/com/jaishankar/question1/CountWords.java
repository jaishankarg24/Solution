package com.jaishankar.question1;

import java.util.LinkedHashMap;

import java.util.Map;
import java.util.Set;

public class CountWords {

	public static void main(String[] args) {
		
		String s = "Hello Word Hello";
		
		String y[] = s.split(" ");
		
		int size = y.length;
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		int i = 0;
		
		while(i!=size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
			}
			else {
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			
			i++;
		}
		
		Set<Map.Entry<String, Integer>> lhmap = map.entrySet();
		
		for(Map.Entry<String, Integer> data: lhmap) {
			System.out.print(data.getKey()+"-"+data.getValue()+", ");
			
		}

	}

}

/*
Output:

Hello-2, Word-1,

*/