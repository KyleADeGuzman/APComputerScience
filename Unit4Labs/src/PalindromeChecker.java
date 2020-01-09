//Coded by Stephen Colandro
import java.util.*;
public class PalindromeChecker {
	
	//Declare and initalize the array and variable that tracks the length of it
	public static void main(String[] args) {
		int arr[] = {2, 4, 5, 4, 2};
		int n = arr.length;
		palindrome(arr, n);
	}
	
	//Method that checks if the array is a palindrome
	static void palindrome(int arr[], int n) {
		int j = 0;
		for(int i=0; i<=n / 2 && n != 0; i++) {
			if(arr[i] != arr[n-i-1]) {
				j=1;
				break;
			}
		}
		
		if (j == 1)
			System.out.println("The array is not a palindrome.");
		else
			System.out.println("The array is a plaindrome.");	
	}
	
}