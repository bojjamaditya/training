package demo;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		// declare and define   an array 
		String friends[] = {"Sai", "Bhaskar", "Nikith" , "Rahul", "Laddu"};
		System.out.println(friends[0]);
		
		// define and declare the array 
		
		String lovers[]= new String[5];
		lovers[0]= "Sarah";
		lovers[1]= "Naomi";
		lovers[2]= "Parker";
		lovers[3]= "Anna";
		lovers[4]= "nidhi";
		System.out.println(lovers[2]);
		
		// declare an array
		
		String girlfriends[];
		
		//define an aray
		girlfriends= new String[20];
		
		girlfriends[0]="charan";
		girlfriends[1]="neha";
		girlfriends[2]="alekhya";
		
		for (int i=0; i<3;i++) {
			System.out.println( "value is " +girlfriends[i]); 
		}
	}

}
