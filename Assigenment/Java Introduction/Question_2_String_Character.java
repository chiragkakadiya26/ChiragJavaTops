package AssignmentsQuestion;

import java.util.Scanner;

public class Question_2_String_Character {

	public static void main(String[] args) {
		
		//Print Vowel or Consonant
		
		 Scanner sc = new Scanner(System.in);
		 
		 	        System.out.print("Please Provide single character from the alphabet: ");
		 	        char ch = sc.next().charAt(0);
		 	        
		 	        // Check Condition Whose Vowel Or Consonant Character.
		 	        
		 	        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
		 	        	ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		 	        	
		 	        	System.out.println("The Character Vowel");
		 	        	
		 	        }else {
		 	        	
		 	        	 System.out.println("The Character Consonant");
		 	        	 
		 	        }
	}
}
