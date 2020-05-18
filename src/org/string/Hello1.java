package org.string;

public class Hello1 {
	public static void main(String[] args) {
		String s="welecome";
		String res="";
		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			if (!res.contains(String.valueOf(c))) {
				res=res+c;
			}
		}
		System.out.println(res);
		String s1 = String.valueOf(123);
		System.out.println(s1);
	}

}
