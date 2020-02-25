package lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Exercise4 {

	public void charFrequency(char[] c) 
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i =0;i<c.length; i++)
		{
		    if(hm.containsKey(c[i])){
                hm.put(c[i], hm.get(c[i]) + 1);
            }else{
                // If new character put that character in the map
                // with the value as 1
                hm.put(c[i], 1);
            }
		}
		System.out.println("The fequency is "+hm);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n   = sc.nextInt();
		char a[] = new char[n];
		System.out.println("Enter the values in the array");
		for(int i =0; i<n;i++)
		{
			a[i]=sc.next().charAt(0);
		}		
		Exercise4 ece = new Exercise4();
		ece.charFrequency(a);
		
	}

}
