package lab1;
import java.util.Scanner;

public class Exercise1 {

	public int calculateSum(int n) {
		int sum= 0;
		int i =3;
		while(n>0)
		{
			 if (i%3 ==0 || i%5 ==0)
			 {
				 sum+=i;
				 n--;
			 }
			 i++;
			 
		}
		return sum;
	}
	
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		Exercise1 ecs = new Exercise1();
		System.out.println("Enter the number");
		System.out.println(ecs.calculateSum(sc.nextInt()));
	}
}
