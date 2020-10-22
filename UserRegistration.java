package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		String mobileNo = "91-9178954621";
		String pattern = "^[1-9]{2}-[1-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(mobileNo);
		if (m.matches())
			System.out.println("Valid");
		else
			System.out.println("Invalid");
	}
}
