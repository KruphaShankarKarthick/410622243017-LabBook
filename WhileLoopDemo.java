import java.util.Scanner; 
public class WhileLoopDemo {
	public static void main(String[] args) {
		int number, sum=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("n Please Enter any Integer Value Below 10: ");
		number =sc.nextInt();
		
		while(number<=10) {
			sum=sum+number;
			number++;
		}
		System.out.format("Sum Of The Numbers From The While Loop is: %d",sum);
	}

}
