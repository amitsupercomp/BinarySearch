package app1;

import java.util.Scanner;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 6, 7, 9, 12, 45, 56, 66, 78, 89, 90, 100};
		
		System.out.println("Enter element Search for...");
		Scanner scanner = new Scanner(System.in);
		int searchElement = scanner.nextInt();
		
		int low = 0, high = arr.length - 1;
		int mid = (low + high) / 2;
		
		while (low <= high) {
			if (searchElement == arr[mid]) {
				System.out.println("Element is present at index :: "+mid);
				break;
			}
			else if (searchElement > arr[mid])
				low = mid + 1;
			else
				high = mid - 1;
			mid = (low + high) / 2;
		}
		if(arr[mid] != searchElement)
			System.out.println("OOps!! Element is not in present in Array...");
	}

}
