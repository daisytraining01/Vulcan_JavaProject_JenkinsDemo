package org.string;

public class ReverseWord {
	public static void main(String[] args) {
		String s="Hello welcome to java";
		String[] s1 = s.split(" ");
		//for (int i = s1.length-1; i >=0 ; i--) {
		//	System.out.println(s1[i]);
		//}
		String str="";
		for (int i = s1.length-1; i >=0 ; i--) {
			String s2 = s1[i];
			str=str+s2+" ";
		}
		System.out.println(str.trim());
	}

}
