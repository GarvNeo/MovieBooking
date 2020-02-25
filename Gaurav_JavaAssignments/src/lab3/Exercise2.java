package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 

public class Exercise2 {

	public String [] sortStrings(String [] arr)
	{
		int n  = arr.length;
		List<String> arr1 =  Arrays.asList(arr);
		Collections.sort(arr1, String.CASE_INSENSITIVE_ORDER);
		String[] a = arr1.toArray(new String[arr1.size()]);
		for(int i=0; i<n; i++) 
		{
			if((n % 2==0 &&  i<(n/2)) || (n % 2!=0 &&  i<((n/2)+1)))
	    	 {
				a[i]= a[i].toUpperCase();
	    	 }
			else {
				a[i]= a[i].toLowerCase();
			}
			
		}
		return a ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of the array");
		  int n = sc.nextInt();
	      String[] name = new String[n];
	      System.out.println("Enter the values in the string array");
	      for(int i = 0; i < n; i++) {
	           name[i] = sc.next();
	      }
	      
	      Exercise2 ece2 = new Exercise2();
	      //ece2.sortStrings(name);
		  System.out.println("The sorted array is \n"+Arrays.toString(ece2.sortStrings(name)));
	}

}
