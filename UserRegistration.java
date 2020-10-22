package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		String password = "siva142";
		String pattern = "^[\\w]{8,}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(password);
		if (m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
