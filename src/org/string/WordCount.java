package org.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
	public static void main(String[] args) {
		String name="java sql selenium sql plsql java unix selenium plsql";
		String[] x = name.split(" ");
		Map<String, Integer> emp=new LinkedHashMap<String, Integer>();
		for (String v : x) {
			if(emp.containsKey(v)) {
				int count=emp.get(v);
				emp.put(v, count+1);
			}
			else {
				emp.put(v, 1);
			}
		}
		System.out.println(emp);
	}

}
