package week1.day2.assignements;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		if (text1.length() == text2.length()) {
			char[] str = text1.toCharArray();
			char[] str1 = text2.toCharArray();
			Arrays.sort(str);
			System.out.println(str);
			Arrays.sort(str1);
			System.out.println(str1);
			if (Arrays.equals(str1, str)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}

	}
}
