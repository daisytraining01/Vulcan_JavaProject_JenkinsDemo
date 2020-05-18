package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCount {
	public static void main(String[] args) {
		String s="WelcomewE";
		char[] C = s.toCharArray();
		Map<Character, Integer> mp=new LinkedHashMap<Character, Integer>();
		//System.out.println(mp);
		//System.out.println("map");
		for (char ch : C) {
			if(mp.containsKey(ch)) {
				int count = mp.get(ch);
				mp.put(ch, count+1);
			} else {
				mp.put(ch, 1);
			}
		}
		System.out.println(mp);
		
	}

}
