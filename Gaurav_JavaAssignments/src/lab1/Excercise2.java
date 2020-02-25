package lab1;

import java.util.Scanner;

public class Excercise2 {

	
	public int calculateDifference(int n) 
	{
		int sqrSum =0, sumSqr= 0;
		for(int i=1;i<=n;i++)
		{
			sqrSum+=(i*i);
			sumSqr+= i;
		}
		sumSqr*=sumSqr;
		return (Math.abs(sqrSum-sumSqr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Excercise2 ece = new Excercise2();
		System.out.println(ece.calculateDifference(sc.nextInt()));
	}

}
