package techfiosExam;

import java.util.Random;
//Generate 500 random numbers and print the nth smallest number in a
//programming language of your choice.
//(Ask user for the Nth smallest number)
import java.util.Scanner;

public class RandomNumberNth {

	public static void main(String[] args) {

		int start=0;  
		int n=0; 
		int end = 500; 
		int arraysize = end - start; 
		
		int numbers[] = new int[arraysize + 1]; 
		
		Random randomnum = new Random();
		System.out.println("Random Numbers");
		for (int count = start; count <= end; count++) { 
			int a = n++;
			int num = randomnum.nextInt(500); 


numbers[a] = num;
			System.out.println(numbers[a]);

		}
		Scanner scan = new Scanner(System.in);
		System.out.println(scan);
		
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

		 if (numbers[i] < smallest)
				smallest = numbers[i];
		}
smallest = scan.nextInt();

		System.out.println("Smallest nth Number is : " + smallest);
		
	}
}
