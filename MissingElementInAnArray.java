package week1.day2.assignements;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
		int length = arr.length;

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int index= i+1;
			if (arr[i]!=index) {
				System.out.println("The missing number in the array is = " + index);
				break;
			}
			

		}

	}

}
