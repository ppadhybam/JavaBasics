package com.basics.string;

import java.util.regex.Pattern;

public class JavaStringNumberCheck {
	
	public static void main(String[] args) {
		String txt = "112";
		Pattern pattern = Pattern.compile(".*\\D.*");
		System.out.println(!pattern.matcher(txt).matches());
	}
}
