
package javaapplication1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class files {
    public static File f=new File("E:\\java\\hello2\\lz77.txt");
	public static void openfile_towrite(String str){
		try {
                    try (FileWriter w = new FileWriter(f)) {
                        w.write(str);
                    }
			} 
		catch (IOException e) {
			}
	    	
	}
	public static String openfile_to_read() 
	{
		try{
			
		Scanner x;
		x=new Scanner(new File("E:\\java\\hello2\\lz77.txt"));
		String s=x.next();
		return s;
	  }
	  catch(IOException e) {
			}
	return null;	
		
	}

    
}
