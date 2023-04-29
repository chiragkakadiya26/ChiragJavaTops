package AssignmentsQuestion;

import java.util.Scanner;

public class Question_3B_natural_While_loop {

	public static void main(String[] args) {
		
		// display the first 10 natural numbers using while loop. 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number 1 to 10 : " );
		
		int n =sc.nextInt();
		
		while(n <=10) {
			
			System.out.println(n);
			
			n++;
		}
	}
}
