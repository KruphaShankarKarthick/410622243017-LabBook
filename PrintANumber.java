import java.util.Scanner;
public class PrintANumber {
	public static void main(String[]args) {
		// Create a reader instance which takes
		// input from standard input - keyboard
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		//nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		
		//println() print the following Line to the output screen
		System.out.println("You entered:"+number);
	}

}
