package org.string;

public class CountLetter {
	public static void main(String[] args) {
		String s="Hi Welcome To java Classes Tommorow At 2.00 p.m!!";
		int numCount=0,smallCount=0,capsCount=0,sepcialCount=0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				smallCount++;
			}else if (s.charAt(i)>='A' && s.charAt(i)<='Z') {
				capsCount++;
			}else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				numCount++;
			}
			else {
				sepcialCount++;
			}
		}
		System.out.println("Total Small letters count: "+smallCount);
		System.out.println("Total Capital letters count: "+capsCount);
		System.out.println("Total number of digits count :"+numCount);
		System.out.println("Total special characters count :"+sepcialCount);
	}

}
