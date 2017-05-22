package com.basics.string;

public class StringReverse {
	
	public static void main(String[] args) {
		System.out.println(getReversedString("Priyabrat"));
	}
	
	public static String getReversedString(String txt) {
		StringBuffer sb = new StringBuffer();
		for(int i = txt.length()-1;i>=0;i--)
		{
			sb.append(txt.charAt(i));
		}
		return sb.toString();
	}
}
