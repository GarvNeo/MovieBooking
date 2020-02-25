package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public int getSecondSmallest(int [] arr)
	{
		Arrays.sort(arr);
		return arr[1];
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n   = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the values in the array");
		for(int i =0; i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Exercise1 ece = new Exercise1();
		
		System.out.println("The second smallest value is \n"+ece.getSecondSmallest(a));
		
	}

}
