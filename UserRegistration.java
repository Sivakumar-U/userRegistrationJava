package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		String fName = "siva";
		String pattern = "^[A-Z]{1}[a-z]{2,}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(fName);
		if (m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
