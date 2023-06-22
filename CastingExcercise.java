public class CastingExcercise {
	//Don't run this Program- Just type and understand How casting Works
	public static void main(String[] args) {
		byte b=10;
		int i=b;//will accept- auto type promotion
		byte c=i;//will not accept-because lower type cannot be put in higher
		byte d=(byte)i;//Type casting make it possible to store compatible types
		byte x=10;
		byte y=20;
		byte sum= x*y;//Error is thrown Because when two bytes are used in a arithmetic operation,the result will be integer
	}

}
