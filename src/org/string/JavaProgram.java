package org.string;
public class JavaProgram {
	public static void characterCountIndentifier() {
		System.out.println("======Character Count in given String=====");
		String upperCase="",lowerCase="",Spechar="",digits="";
		int upper=0,lower=0,spechar=0;
		int digit=0;
		String s="MavericSytem25415@gmail.com";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			char d = c[i];
			if(d>='A' && d<='Z') {
				upperCase=upperCase+d;
				upper++;
			}
			else if(d>='a' && d<='z') {
				lowerCase=lowerCase+d;
				lower++;
			}
			else if(d>='0' && d<='9') {
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
		System.out.println();
	}
	public static void removeDuplicateWord() {
		System.out.println("======removeDuplicateWord in given String=====");
		String res="";
		String s="java sql selenium java plsql sql";
		String[] sp = s.split(" ");
		for (String x : sp) {
			if(!res.contains(x)) {
				res=res+x+" ";
			}
		}
		System.out.println(res.trim());
		System.out.println();
	}
	public static void stringSplitCount() {
		System.out.println("======stringSplitCount in given String=====");
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
		System.out.println();
	}
	public static void reverseWord() {
		System.out.println("======reverseWord in given String=====");
		String s="Hello welcome to java";
		String[] s1 = s.split(" ");
		String str="";
		for (int i = s1.length-1; i >=0 ; i--) {
			String s2 = s1[i];
			str=str+s2+" ";
		}
		System.out.println(str.trim());
		System.out.println();
	}
	public static void pattern() {
		System.out.println("======Pattern=====");
		int num=5;
		System.out.println("Enter number of Rows : "+num);
		for (int i = 1; i <=num; i++) {
			for (int j = 1; j <=num-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
	}
	}
	}
