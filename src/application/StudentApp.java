package application;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student("aditya","392839124");
		st.enroll("math");
		st.enroll("eng");
		st.enroll("science");
		st.showCourses();
		

	}
	
}

class Student {
	private String state;
	private String city;
	private String phone;
	private String name;
	private String ssn;
	private String email;
	private static int id= 1031;
	private String uid;
	private String courses="";
	private  static final int costOfCourse=1000;
	private int balance=0;
	 
	public Student(String name,String ssn) {
		id++;
		this.name=name;
		this.ssn=ssn;
		email();
		SetUserId();
		
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void email() {
		email=name+"@gmail.com";
		System.out.println("Your email address:"+ email);
	}
	private void SetUserId() {
		int min=1000;
		int max=9000;
		int random = (int)(Math.random()*(max-min));
		random =random+min;
		uid= id+""+ random + ssn.substring(5);
		System.out.println("Your user id :" + uid);
	
}
	public void enroll(String course) {
		this.courses=this.courses+"\n"+course;
		System.out.println("courses enrolled:"+courses);
		balance=balance+costOfCourse;
		
	}
    public void payTution(int amount) {
    	System.out.println("payment:"+amount);
    	balance= balance-amount;
		
	}
    public void checkBalance() {
    	System.out.println("check Balance $:"+balance);
		
	}
    public void showCourses() {
    	System.out.println(courses);
		
	}
   public String toString() {
		return null ;
	}
	
	
	
	
}
