package AssignmentsQuestion;

import java.util.Scanner;

public class Question_3A_leapYearOrNot {

	public static void main(String[] args) {
		
		//takes a year from user and print whether that year is a leap year or not

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Enter Year : ");
		
		int year = sn.nextInt();
		
		//Check Leap Year Conditional Statement
		
		if(year%4 == 0 && (year%400 == 0 || year%100 != 0)) {
			
			System.out .println("This Year Is Leep Year!!!!");
		}else{
			
			System.out.println("This Year Is Not Leep Year !!!!!");
		}
	}
}
