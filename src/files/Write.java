package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)define the path were we want to read the fie
		String filename= "C:\\Users\\bojjam.aditya\\Desktop\\sdet university\\sample.txt";
		String message="hey java learner !!!!";

		// 2) create the file in java
		File file=new File(filename);
	
	
	   
	try {

	     // 3) open the fie in java
		FileWriter fw = new FileWriter(file);
		
		//4) write to the file
		fw.write(message);
		
		//5) close the file
		fw.close();	
	   } 
	catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("Error :file not found"+filename);
		e.printStackTrace();
	}
	finally {
		System.out.println("closing the file writer");
	}
	   
	}
}
