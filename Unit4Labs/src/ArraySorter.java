//Coded by Stephen Colandro
import java.util.*;
public class ArraySorter {

	public static void main(String[] args) {
		
		//Getting total number of elements from user
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in your array: ");
		int num = s.nextInt();
		
		//Declare's and initializes array
		int arr[] = new int[num];
		int i, j, temp = 0;
		
		//Gets all elements in the array from user
		System.out.println("Enter the " + num + " elements in your array: ");
		for (i=0; i<num; i++) {
			arr[i]=s.nextInt();
		}
		
		//Arranges the elements in the array in ascending order
		for (i=0; i<num; i++) {
			for (j = i + 1; j<num; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//Prints the array in ascending order
		System.out.println("Your array in ascending order is: ");
		for (i = 0; i<num; i++) {
			System.out.print(" " + arr[i]);
		}
	}

}