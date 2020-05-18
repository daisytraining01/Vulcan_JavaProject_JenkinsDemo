package org.string;

public class Tests {
	public static void main(String[] args) {
		/*char c = '2';
		String str1 = "Hello welcome to java class Hel Hi";
		System.out.println("Index of H in str1 after from 15 character : " + str1.indexOf('H', 15));
		System.out.println("Index of H in str1 after from 10 character : " + str1.lastIndexOf('H', 10));

		String s = "A";
		int i = s.compareTo("B");// 65<66 = -1
		System.out.println(i);

		String ss = "B";
		int is = ss.compareTo("A");// 66>65 = 1
		System.out.println(is);

		String s1 = "ABCD";
		int i1 = s1.compareTo("ACLK");//4>2 = 2// 66<67 = -1
		System.out.println(i1);*/
		
		String s1 = new String("abc"); // goes to Heap Memory, like other objects
		String s2 = "abc"; // goes to String Pool
		String s3 = "abc"; // again, goes to String Pool

		// Let's check out above theories by checking references
		System.out.println("s1==s2? " + (s1 == s2)); // should be false
		System.out.println("s2==s3? " + (s2 == s3)); // should be true
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		// Let's call intern() method on s1 now
		s1 = s1.intern(); // this should return the String with same value, BUT from String Pool
System.out.println(s1);
System.out.println(System.identityHashCode(s1));
		// Let's run the test again
		System.out.println("s1==s2? " + (s1 == s2)); // should be true now

		StringBuffer demo = new StringBuffer("Hello");
		demo=new StringBuffer("Bye");
		System.out.println(demo);
		
	}

}
