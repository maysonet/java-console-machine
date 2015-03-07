import java.util.Scanner;

/** 
 * Contains all methods to initiate actions of the menus, 
 * read and write methods, and numbers and string specific 
 * menu actions. 
 * @author Christopher Maysonet*/
public class ProjectUtils {
	private static final Scanner input = new Scanner(System.in);
	public static int c1=0, c2=0, c3=0, c4=0, c5=0;
	
	/**
	 * Read the user integer input
	 * @return An integer number containing the user input*/
	public static int readInteger() { 
		return input.nextInt(); 
	}
	
	/** 
	 * Read the user String input
	 * @return A String containing the user input*/
	public static String readString(){
		return input.nextLine();
	}
	
	/** 
	 * Read the user Float input
	 * @return A float number containing the user input*/
	public static float readFloat(){
		return input.nextFloat();
	}
	
	/** 
	 * Read the user double input
	 * @return A double number containing the user input*/
	public static double readDouble(){
		return input.nextDouble();
	}
	
	/** 
	 * Print in screen char-type variable without new line
	 * @param c the character to be printed
	 * 									*/
	public static void printChar(char c){
		System.out.print(c);
	}
	
	/** 
	 * Print in screen FLOATPair object with new line
	 * @param x the object type FLOATPair to be printed
	 * 									*/
	public static void printFLOATPair(FLOATPair x){
		System.out.println(x);
	}
	
	/** 
	 * Print in screen integer variable with new line
	 * @param i the integer to be printed
	 * 									*/
	public static void printInt(int i){
		System.out.println(i);
	}
	
	/** 
	 * Print in screen String without new line
	 * @param s the string to be printed without a new line
	 * 									*/
	public static void print(String s) { 
		System.out.print(s); 
	} 
	
	/** 
	 * Print in screen String with new line
	 * @param s the string to be printed without a new line
	 * 									*/
	public static void println(String s) { 
		System.out.println(s); 
	}

	
	/**
     * Initiates the execution of the menu for operations with numbers. 
     * This is to be executed each time the user selects option 1 in main
     * menu. 
     */
	public static void operationsOnNumbers() {
		NumbersMenuManager numbersMenuManager = NumbersMenuManager.getInstance(); 
		numbersMenuManager.run(); 
	}

	/**
     * Initiates the execution of the menu for operations with strings. 
     * This is to be executed each time the user selects option 2 in main
     * menu. 
     */
	public static void operationsOnStrings() {
		StringsMenuManager stringMenuManager = StringsMenuManager.getInstance(); 
		stringMenuManager.run(); 
	}

	/** 
	 * Show usage of each action in the program*/
	public static void showStatistics() {
		c5++;
		System.out.println("Show Statistics");
		print("Operation in the Program");
		println("\t\t Number of Times Executed");
		println("============================\t\t============================");
		
		println("Reverse a String \t\t\t\t" + c1);
		println("Format a String \t\t\t\t" +c2);
		println("Process a Quadratic Equation \t\t\t" +c3);
		println("Compute Average of Numbers \t\t\t" + c4);
		println("Show Statistics \t\t\t\t" + c5);
	}

	/**
	 * Show the reverse string of a given string*/
	public static void reverseAString() {
		c1++;
		String in  = readString();
		do{
		print("\nEnter a string to be reversed: "); 
		in  = readString();
		char c[] = in.toCharArray();
		for( int i = c.length -1; i>=0; i--){
		   printChar(c[i]);
		}
		print("\n");
		
		}while(in.isEmpty());
	}

	/**
	 * Format a given string using a given pattern */
	public static void formatAString() {
		c2++;
		String in = readString();
		String pattern, exit;
		print("Enter string to be formatted: "); 
		in  = readString();
		do{
		int j=0;
		print("Enter pattern:(example: xxx-xx-xx) ");
		pattern = readString();
		while (in.length() < pattern.length()) {
			in = in + "\0";
		}
		
		for (int i = 0; i < pattern.length(); i++) {
			if(pattern.charAt(i) == 'x'){
				printChar(in.charAt(j));
				j++;
			}
			
			else{
				print("-");
			}
				
		}
			
		
		print("\nDo you want to enter another string? (yes/no)");
		exit = readString();
		
		}while(exit.equalsIgnoreCase("yes"));
		
		
		
	}

	/** Process a Quadratic operation in standard form, 
	 * 	given the three coefficients that represent the equation */
	public static void processQuadraticEquation() {
		c3++;
		float a, b, c;
		println("A quadratic equation in  standard form is ax²+bx+c = 0,\nwhere a, b, and c are the three coefficients and a ≠ 0.");
		println("Assign some real numbers to the coefficients:");
		println("");
		do{
			println("Enter value for a. (Remember, a ≠ 0): ");
			a = readFloat();
		}while(a == 0);
		
		println("Enter value for b:");
		b = readFloat();
		println("Enter value for c:");
		c = readFloat();

		QuadraticEquation x = new QuadraticEquation(a,b,c);
		int realSolutions = x.realSolutionsCount();
		if(realSolutions == 0){
			println("There are no real solutions.");
		}
		else{
			println(x.getRealSolutions());
		}
	
		
		
	}

	/** Asks for positive real values until value is negative. Then 
	 * it computes the average of the list of real numbers  */
	public static void computeAverageOfNumbers() {
		c4++;
		double sum, avg, value;
		int count=0;
		sum=0;
		do{
		print("Enter a number: ");
		value = readDouble();
		if(value >= 0){
		sum += value;
		count++;
		}
	}while(value >= 0);
		
		avg = sum / count;
		println("The sum is: " + sum);
		println("Total numbers: " + count);
		println("The average is: " + avg);
		
	}

}
	