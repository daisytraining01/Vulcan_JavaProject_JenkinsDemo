package org.string;

public class RemoveDupWord {
	public static void main(String[] args) {
		String res="";
		String s="java sql selenium java plsql sql";
		String[] sp = s.split(" ");
		for (String x : sp) {
			if(!res.contains(x)) {
				res=res+x+" ";
			}
		}
		System.out.println(res.trim());
	}

}
