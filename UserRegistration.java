package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		String email = "abc.xyz@bl.co.in";
		String pattern = "^[a-z]{3,}[.\\w]*@[\\w]{2,}.[\\w]{2,3}[.a-z]*$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(email);
		if (m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
