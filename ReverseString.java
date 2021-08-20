import java.util.ArrayList;
import java.util.Scanner;


public class ReverseString {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		System.out.println("Please enter the " + n + "elements");
		for(int i=0;i<n;i++) {
			String elements = sc.next();
			arr.add(elements);
			
		}
		
		System.out.println("Reversing it: ");
		
		for(int i=arr.size()-1; i>=0;i--) {
			String currentElements = arr.get(i);
			System.out.println(currentElements);
		}
	}

}
