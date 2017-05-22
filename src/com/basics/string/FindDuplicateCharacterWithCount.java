package com.basics.string;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateCharacterWithCount {
	
	public static void main(String[] args) {
		
		String str = "Priyabrat";
		char []chars = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i=0;i<chars.length;i++)
		{
			char ch = chars[i];
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entSet = map.entrySet();
		for(Entry<Character, Integer> ent:entSet)
		{
			if(ent.getValue() > 1){
				System.out.println("Character "+ent.getKey()+" is repeated "+ent.getValue()+" times");
			}
		}
	}
}
