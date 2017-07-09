package javaapplication1;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import javax.swing.JOptionPane;
import java.util.Vector;
import java.io.File;
import java.io.*;

public class JavaApplication1 {
    public static void main(String[] args) throws IOException {
        String str=JOptionPane.showInputDialog("eneter String to cpmprassion ");
        files.openfile_towrite(str);
	String h=files.openfile_to_read();
        makecomprassion.comprassion(h);
        makecomprassion.write_tags();
        makedecomprassion.openfile_to_read();
        String G=makedecomprassion.decomprassion();
        System.out.println(G);
        JOptionPane.showMessageDialog(null,"string is "+G,"decompession",JOptionPane.PLAIN_MESSAGE);

       

        

    }
    
}
