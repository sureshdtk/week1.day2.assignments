package week1.day2.assignements;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int length=arr.length;

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" Second largest Number is " + arr[length-2]);
	}
	}

