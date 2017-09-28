package problemSolving;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class readLineFromAFile {
 
	public static void main (String args[]) {
		
		BufferedReader br=null;
		String s="";
		
		try{
			br=new BufferedReader (new FileReader("filenew.txt"));
			while((s=br.readLine()) != null){
				System.out.println(s);
			}
		}
		catch(FileNotFoundException e ){
			System.out.println("file not found");
		}
		catch(IOException e ){
			System.out.println("file connot read");
		}
	}
	}

