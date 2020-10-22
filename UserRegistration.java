package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		String password = "Sivak123";
		String pattern = "^(?=.*?[A-Z])(?=.*?[0-9]).{8,}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(password);
		if (m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
