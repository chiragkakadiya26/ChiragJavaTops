package AssignmentsQuestion;

import java.util.Scanner;

public class Question_1 {
	
	public static void main(String[] args) {
		
		//three numbers from the user and print the greatest number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Number 1 : ");
		
		int num = sc.nextInt();
		
		System.out.println("Enter Your Number 2 : ");
		
		int num1 = sc.nextInt();
		
		System.out.println("Enter Your Number 3 : ");
		
		int num2 = sc.nextInt();
		
		// Check Condition whose Greatest Number Logic.
		
		if(num > num1 && num > num2) {
			
			System.out.println("The Greatest Number Is Num :" + num);
			
		}else if(num1 > num && num1 > num2) {
			
			System.out.println("The Greatest Number Is Num1 : " + num1);
			
		}else {
			
			System.out.println("The Greatest Number Is Num2 : " + num2);
		}
		
	}

}
