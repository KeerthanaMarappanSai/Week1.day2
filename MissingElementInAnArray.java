package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		int length = arr.length;
		int totalSum = (length*(length+1))/2;
		int sumOfArray = 0;
		for(int i=0; i<=length-2; i++) 
		{
			sumOfArray = sumOfArray+arr[i];
		}
		int missingElement = totalSum-sumOfArray;
		System.out.println("Missing element in an array is: "+missingElement);
			
		
	}

}
