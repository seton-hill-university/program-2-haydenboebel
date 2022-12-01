
	// Application:		Program 2
	// Name:			Hayden Boebel
	// Github User:		haydenboebel
	// Date:			Sep 22, 2022
	// Version:			1.0
	// Description:		Scanners and asking the user for input 

			// importing a scanner 
			import java.util.Scanner;
			public class BoebelProgram2 {
			public static void main(String[] args) {

			// collecting input from a user
			Scanner userScanner = new Scanner(System.in);
		
			System.out.println("What is your first number choice?");
			int n1 = userScanner.nextInt();
			
			System.out.println("What is your second number choice?");	
			int n2 = userScanner.nextInt();
			
			System.out.println("What is your third number choice?");	
			int n3 = userScanner.nextInt();
			 
			// spacing for neatness
			System.out.println("");

			// menu with actions 
			System.out.println("Please select a menu option.");
			System.out.println("");
			System.out.println("Menu of actions:");
			System.out.println("	1) Add");
			System.out.println("	2) Subtract");
			System.out.println("	3) Multiply");
			System.out.println("	4) Divide");
			
			// spacing for neatness  
			System.out.println("");
			
			// asking user for menu choice 
			System.out.println("Enter your menu selection.");
			int menuChoice = userScanner.nextInt();
			
			// spacing for neatness
			System.out.println("");
			
			int calculatedOutput = 0;
			String operation = ""; 
			
			// switch statement 
			switch (menuChoice)
			{
	         case 1:  calculatedOutput = n1 + n2;
	         			operation = "added"; 
	         			break;
	         case 2:  calculatedOutput = n1 - n2;
	         			operation = "subtracted"; 
	                  	break;
	         case 3:  calculatedOutput = n1 * n2;
	         			operation = "multiplied"; 
	         			break;
	         case 4:  calculatedOutput = n1 / n2;
	         			operation = "divided"; 
	         			break;
	         default: break; 
			}
			
			System.out.println("Your numbers " + operation + " together equal " + calculatedOutput);
			
			// if / else statement 
			if(calculatedOutput>n3) 
			{
				System.out.println(calculatedOutput + " is greater than " + n3);
			}
			else
			{
				System.out.println(calculatedOutput + " is not greater than " + n3);
			}		
		
	}
}
