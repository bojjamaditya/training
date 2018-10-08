package exceptions;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =5;
		int b = 0;
		
		try {
		System.out.println(a/b);
	}
catch(ArithmeticException e ) {
	System.out.println("cannot divide by zero");
	System.out.println(e.toString());
}
}
}
