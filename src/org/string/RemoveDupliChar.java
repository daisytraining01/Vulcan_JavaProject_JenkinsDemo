package org.string;

public class RemoveDupliChar {
	public static void main(String[] args) {
		String s="ABCDABhhhhdkdABC";
		String res="";
		/*char[] c = s.toCharArray();
		for (char d : c) {
			if(!res.contains(String.valueOf(d))) {
				res=res+d;
			}
		}
		
		System.out.println(res);*/
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!res.contains(String.valueOf(c))) {
				res=res+c;
			}
		}
		System.out.println(res);
	}
	
}
