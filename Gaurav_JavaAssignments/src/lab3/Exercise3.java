package lab3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise3 {

	public int[] reverseSortedArray(int [] arr)
	{
		
		for(int i=0; i<arr.length; i++)
		{
			StringBuilder s = new StringBuilder();
			s.append(String.valueOf(arr[i]));
			s = s.reverse();
			arr[i]=Integer.valueOf(String.valueOf(s));
		}
		
		Arrays.sort(arr);
		return arr;
		
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
		Exercise3 ece = new Exercise3();
		
		System.out.println("The sorted reverse array is \n"+Arrays.toString(ece.reverseSortedArray(a)));

	}

}
