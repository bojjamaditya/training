package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Passwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  String filename ="C:\\Users\\bojjam.aditya\\Desktop\\passwords.txt";
	  String[] passwords= new String[10];
	  
	  File file =new File(filename);
	  try {
			BufferedReader br = new BufferedReader(new FileReader(file));	
	        for (int i=0;i<passwords.length;i++) {
		    passwords[i]=br.readLine();
		  
	  }}
	  catch (FileNotFoundException e) {System.out.println("Error: couldnt not open file");} 
	  catch (IOException e) {System.out.println("Error: couldnt not read file");}
	  
	  for (String password : passwords)
	  {
		  System.out.println(password);
		  boolean hasLetters=false;
		  boolean hasNumbers=false;
		  boolean hasSpecial=false;
		  boolean hasInvalidChar=true;
	  
	  
	  for(int n=0; n<password.length();n++) {
		  if("0123456789".contains(password.substring(n,n+1))) {
		  System.out.println("position "+ n +" contains number");
		  }
		  else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(n,n+1))) {
			  System.out.println("position "+ n +" contains alphabet");
			  }
 
		  else if  ("!@#$".contains(password.substring(n,n+1))) {
			  System.out.println("position "+ n +" contains special character");
			  }
		  
			  else {
				  try {
					  throw new InvalidCharacterException(password.substring(n,n+1));
				} catch (InvalidCharacterException e) {
					e.toString(); break;}
					
					
				}
			  }
	  
		  try {
		  if(!hasNumbers) {
			  throw new NumberCriteriaException(password);
		  }
		
		  }
		  catch(NumberCriteriaException e){
			  System.out.println(e.toString());
		  }
		
	  }}
	  }
	  
	 class InvalidCharacterException extends Exception{
		String ch;
		 public InvalidCharacterException(String ch) {
			 this.ch=ch;
		 }
		 public String toString() {
			 return "InvalidCharacterException:" + ch;
		 }
	 }
	 
	 class NumberCriteriaException extends Exception{
		String password;
		 public NumberCriteriaException(String password) {
			 this.password=password;
		 }
		 public String toString() {
			 return "NumberCriteriaException:" + password;
		 }
	 
	  
	  
	}
	
