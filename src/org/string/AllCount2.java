package org.string;

public class AllCount2 {
	public static void main(String[] args) {
		String upperCase="",lowerCase="",Spechar="",digits="";
		int upper=0,lower=0,spechar=0;
		int digit=0;
		String s="GreenTech25415@hmail.com";
		char[] c = s.toCharArray();
		//for (char d : c) {
			
		//}
		for (int i = 0; i < c.length; i++) {
			char d = c[i];
			if(Character.isUpperCase(d)) {
				upperCase=upperCase+d;
				upper++;
			}
			else if(Character.isLowerCase(d)) {
				lowerCase=lowerCase+d;
				lower++;
			}
			else if(Character.isDigit(d)) {
				digits=digits+d;
				digit++;
			}
			else {
				Spechar=Spechar+d;
				spechar++;
			}
			
		}
		System.out.println("Uppercase letter : "+upperCase +", Size : "+upper);
		System.out.println("Lowercase letter : "+lowerCase +", Size : "+lower);
		System.out.println("Digits : "+digits +" Size : "+digit);
		System.out.println("Special character : "+Spechar +", Size : "+spechar);
	}

}
