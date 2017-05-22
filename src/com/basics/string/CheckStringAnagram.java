package com.basics.string;

public class CheckStringAnagram {
	
	public static void main(String[] args) {
		boolean isAnagram = isStringsAnagram("post","stop");
		if(isAnagram)
			System.out.println("These words are anagram ");
		else
			System.out.println("These words are not anagram ");
	}

	private static boolean isStringsAnagram(String str1, String str2) {
		if(str1.length() != str2.length()){
			return false;
		}
		char [] chars = str1.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			int index = str2.indexOf(chars[i]);
			if(index != -1)
			{
				String temp1 = str2.substring(0,index);
				String temp2 = str2.substring(index +1, str2.length());
				str2 = temp1 + temp2;
			}
			else
			{
				return false;
			}
		}
		return str2.isEmpty();
	}
}
