package com.basics.string;

public class StringReverseUsingRecursion {
	
	public static void main(String[] args) {
		System.out.println(getReverse("Priyabrat"));
	}
	
	public static String getReverse(String txt){
		if(txt.length() == 0)
			return "";
		return txt.charAt(txt.length()-1) + getReverse(txt.substring(0,txt.length()-1));
	}

}
