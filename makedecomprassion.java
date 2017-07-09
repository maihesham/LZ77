
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.io.*;
import java.lang.*;
public class makedecomprassion {
    public static Vector<String>tags_decompr=new Vector<String>();
    public static void openfile_to_read() 
	{
	try{
            Scanner x;
	    x=new Scanner(new File("E:\\java\\hello2\\fortags.txt"));
            while(x.hasNext()) {
	    String s=x.next();
            tags_decompr.add(s);
		
               }
	  }
	  catch(IOException e) {
			}
		
	}
    public static void outt(){
        for(int i=0;i<tags_decompr.size();i++){
			System.out.println(i);
			System.out.println(tags_decompr.elementAt(i));
		}
        
    }
    public static String decomprassion(){
		String str="";
		for(int i=0;i<tags_decompr.size();i++){
			Vector<String>info=new Vector<String>();
			String q=tags_decompr.elementAt(i);
			info=Make_strings(q);
			int pointer=Integer.parseInt(info.elementAt(0));
			int lengh=Integer.parseInt(info.elementAt(1));
			String next_char=Make_char(q);
			if(pointer==0){
				str+=""+next_char;
				
			}else{
				int th=0;
				for(int lw=str.length(),lg=0;lw>=0;lw--,lg++){
					if(lg==pointer){
						th=lw;
						break;
					}
				}
				String newchars="";
				for(int j=0;j<lengh;j++){
					newchars+=str.charAt(th);
					th++;
					
				}
				str+=newchars;
				str+=next_char;
			}
		}
		
		return str;
	}
	public static String Make_char(String x){
		int le=x.length()-2;
		String e="";
		e+=x.charAt(le);
		return e;
		
		
	}
	public static Vector Make_strings(String x){
		int coun=0;
		String pointer="";
		String lengh="";
		while(x.charAt(coun)!=','){
			pointer+=x.charAt(coun);
			coun++;
			
		}
		coun++;
		while(x.charAt(coun)!=','){
			lengh+=x.charAt(coun);
			coun++;
			
		}
		coun++;
		Vector<String>po=new Vector<String>();
		po.addElement(pointer);
		po.addElement(lengh);
		return po;
		
		
		
	}


    
}
