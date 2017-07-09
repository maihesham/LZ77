package javaapplication1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.io.File;
import java.io.*;
import java.lang.*;
public class makecomprassion {
    public static Vector<String>tags_compr=new Vector<String>();
	public static void comprassion(String str){
            String now="";
            int j=0;
            int fi=0;
            String for_back="";
           for_back= make_back(str,0);
            String find_it="";
            String z="";
            z+=str.charAt(0);
            make_tag(0,0,z);
            for(int i=1;i<str.length();i++){
                if(j==0){
                    now+=str.charAt(i);
                }else{
                    now="";
                    now+=str.charAt(i);
                }
               if(!for_back.contains(now)&&fi==0){
                    int lenght=now.length()-1;
                    String h="";
                    h+=now.charAt(lenght);
                    make_tag(0,0,h);
                    for_back= make_back(str,i);
                    find_it="";
                    j=1;
                    
                    
                }else if((fi==1&&!for_back.contains(now))||(i==str.length()-1)){
                    j=1;fi=0;
                   // System.out.println("now from comprassion "+now+"      "+find_it);
                    make_every_thing(find_it,i,for_back,now,str);
                    for_back=make_back(str,i);
                    find_it="";    
                }
                else{
                    find_it=now;
                    j=0;fi=1;
                }
            }	  
	}
       
      public static boolean make_every_thing(String find_it,int pos,String for_back,String now,String str){
            int le=for_back.length()-1;
            for(int i=le;i>=0;i--){
                String h="";
                h+=for_back.charAt(i);
                if(equalequal(h,find_it)){
                    String nextchar="";
                    int l=now.length()-1;
                    nextchar+=now.charAt(l);
                    make_tag(pos-i-1,find_it.length(),nextchar);
                    return true;
                    
                }else{
                   for(int j=i-1;j>=0;j--){
                       h+=for_back.charAt(j);
                       String h2=rev(h);
                       if(equalequal(h2,find_it)){
                           String nextchar="";
                            int l=now.length()-1;
                            nextchar+=now.charAt(l);
                           pos=pos-find_it.length();
                           make_tag(pos-j,find_it.length(),nextchar);
                           return true;
                           
                       }
                   }
                }
                }
             return true;
            }
         public static String rev(String x1){
             String h="";
             for(int i=x1.length()-1;i>=0;i--){
                 h+=x1.charAt(i);
             }
             return h;
              
             
         }   
        public static boolean equalequal(String x1,String x2){
            int le1=x1.length();
            int le2=x2.length();
            if(le1==le2){
               for(int i=0;i<le2;i++){
                   if(x1.charAt(i)!=x2.charAt(i)){
                       return false;
                   }
               } 
                
            }else{
                return false;
            }
            return true;
        }
        
	public static String make_back(String z,int i){
		String back="";
		for(int j=0;j<=i;j++){
			back+=z.charAt(j);
		}
		return back;	
	}
	public static void make_tag(int x,int y,String z){
		String com="";
		com=x+","+y+","+z+";";
		tags_compr.add(com);
	}

    




public static void of(){
		for(int i=0;i<tags_compr.size();i++){
			System.out.println(i);
			System.out.println(tags_compr.elementAt(i));
		}
	}

public static void write_tags() throws IOException{
   File f=new File("E:\\java\\hello2\\fortags.txt");
   FileWriter w = new FileWriter(f);
        for(int i=0;i<tags_compr.size();i++){
            try {
	        w.write(tags_compr.elementAt(i));
                w.append('\n');
		} 
		catch (IOException e) {
			}
        }
        w.close();
        
    }

}
