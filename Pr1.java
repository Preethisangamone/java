package com.sangamone.test1;

public class Pr1 {
	public static void main(String[] args) {
		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s2 = "";
		int len1 = s1.length();
		for(int i=1; i<=len1;i++) {
			s2 = s2 + s1.substring(len1-i, len1-(i-1));
		}
		System.out.println(s2);
		/*System.out.println(s1.substring(4-1, 4-0));
		System.out.println(s1.substring(4-2, 4-1));
		System.out.println(s1.substring(4-3, 4-2));*/
	}
}

