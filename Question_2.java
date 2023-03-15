package codeit_question;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));	
		}
		
	}

}
