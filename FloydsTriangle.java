import java.util.Scanner;
  class FloydsTriangle {
	  public static void main(String[] args) {
		int rows,number=1,counter,j;
		
		
		//To Get the User's Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of Rows for Floyd's Triangle");
		
		
		//Copying User Input Into An Integer Variable Named Rows
		rows=input.nextInt();
		System.out.println("Floyd's Triangle");
		System.out.println("***********************");
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.println(number+" ");
				//Incrementing the Number Value
				number++;
			}
			//For new Line
			System.out.println();
		}
	}

}
