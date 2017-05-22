package com.basics.string;

public class LowerToUpperCase {
	
	public static void main(String[] args) {
		String str = "PriyabraT";
		lowerToUpperCaseConversion(str);
	}
	
	public static void lowerToUpperCaseConversion(String txt){
		char [] chars = txt.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for (int i=0;i<chars.length;i++)
		{
			char ch = chars[i];
			int temp = ch;
			if(ch >=97 && ch<=122)
			{
				// Already in lower case
				temp = temp-32;
			}
			else
			{
				temp = temp+32;
			}
			sb.append((char)temp);
		}
		System.out.println(sb.toString());
	}
}
