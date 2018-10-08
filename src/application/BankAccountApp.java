package application;

public class BankAccountApp  {

	public static void main(String[] args) {
		BankAccount bk = new BankAccount("392839124");
	    bk.setName("Aditya");
	    System.out.println(bk.getName());
	    bk.makeDeposit(500);
	    bk.payBill(100);
	    bk.accrue();
        System.out.println(bk.toString());	    
	    
	}

	
	

	}
//properties of the class
class BankAccount implements IInterest {
	
	public static int id=1000;
	private String accountNumber;
	private static final String routingNumber="00142536";
	private String name;
	private String ssn;
	private double balance;

	
// constructor
public BankAccount(String ssn) {
	id++;
	this.ssn=ssn;
	SetAccountNumber();
	
}
private void SetAccountNumber() {
	int random = (int)(Math.random()*100);
	accountNumber= id+ ""+ random + ssn.substring(0,2);
	System.out.println("Your Account Number :" + accountNumber);
}
public void setName(String name) {
	this.name=name;
}
public String getName() {
	return name;
}

public void payBill(double amount) {
	balance=balance-amount;
	System.out.println("paying bill:"+amount);
	showBalance();
}
public void makeDeposit(double amount) {
	balance=balance+amount;
	System.out.println("making deposit:"+amount);
	showBalance();
}
public void showBalance() {
	System.out.println("balance:"+balance);
}
@Override
public void accrue() {
	// TODO Auto-generated method stub
	
	balance = balance * (rate/100);
	showBalance();
}
@Override
public String toString() {
	return "[ Name:" + name + "]\n[Account Number:" +accountNumber +"]\n[Routing Number:"+routingNumber +"]\n[Balance:"+balance+"]" ;
}

}


