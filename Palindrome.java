package week1.day2.assignements;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String str ="Liril";
		String rev = "";
		int length = str.length();
		char[] charArray = str.toCharArray();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + charArray[i];
		}
		if (rev.equalsIgnoreCase(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}
}	
