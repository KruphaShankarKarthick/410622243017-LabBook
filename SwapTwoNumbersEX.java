
public class SwapTwoNumbersEX {
	public static void main(String[] args) {
		float first=2.50f,second=4.50f;
		System.out.println("--before Swap--");
		System.out.println("First Number="+first);
		System.out.println("second Number="+second);
		
		//Value of First is assigned to temp
		float temporary = first;
		
		//value if second us assigned to first
		first=second;
		
		//value of temp (which Contains the initial value of first) is assigned to second
		second = temporary;
		
		System.out.println("--After Swap--");
		System.out.println("First Number = "+first);
		System.out.println("Second Number = "+second);
	}

}
