package binarysearch;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		//DEfine an array
		int[] array = {2,5,9,13,23,34,39,45,56,78,89,96,100};
		
		//Create a Scanner instance to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to be searched for...");
		int num = sc.nextInt();
		
		//Here call the binarySearch method which return the index number in case of present
		//It will return -1 when number will not be present in the array.
		int result = binarySearch(array, num);
		
		//If index will return then it should be 0 or greater than 0
		if (result >= 0)
			System.out.println("Number is present at " + result + " index");
		else
			System.out.println("Number is not present in the list");
		sc.close();
	}
	
	private static int binarySearch(int[] array, int num) {
		
		//Declare and intialize the variable left right and middle.
		int left = 0, middle = 0, right = array.length;
		
		//Start the loop to check whether number is present or not
		while (left <= right) {
			//first set middle index.
			middle = (left + right) / 2;
			//check if number is equal to the middle element then return the index number.
			if (array[middle] == num)
				return middle;
			//if number is less than then shift right = middle - 1;
			else if (num < array[middle])
				right = middle - 1;
			//if number is greater than middle then shift left = middle + 1.
			else
				left = middle + 1;
		}
		return -1;
	}
}
