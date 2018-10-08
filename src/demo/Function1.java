package demo;

public class Function1 {

	 public static void main(String args[]) {
		 int num1=10;
		 int num2=20;
		 Function1 fun= new Function1();
		 System.out.println("The sum is:"+ fun.addNum(num1, num2));
	 }
	 
	 public int addNum(int num1, int num2) {
		 int sum= num1+num2;
		 return sum;
	 }
}
