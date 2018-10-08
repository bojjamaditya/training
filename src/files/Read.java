package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// define the file
       String filename= "C:\\Users\\bojjam.aditya\\Desktop\\sdet university\\sample.txt";
       String text=null;
       
       // create file
       File file = new File(filename);
	
	// open the file
	BufferedReader br;
	try {
		br = new BufferedReader(new FileReader(file));
		
		 text=br.readLine();
		 br.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Read the file
	finally {
		System.out.println("Finished reading the file");
	}
	System.out.println(text);
	}
}
