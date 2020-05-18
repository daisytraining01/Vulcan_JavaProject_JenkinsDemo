package org.string;

public class FirstLettCap {
	public static void main(String[] args) {
		String s="welcome to java";
		String[] sp = s.split(" ");
		String res="";
		for (String x : sp) {
			char c = x.charAt(0);
			char d = Character.toUpperCase(c);
			String remstr = x.substring(1,x.length());
			res=res+d+remstr+" ";
		}
		System.out.println(res.trim());
		
	}

}
