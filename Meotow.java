package meotow;

import java.io.*;
import java.util.*;

public class Meotow {

	public static void main(String[] args) {
		String folder = "C:\\喵兔";		
		File f = new File(folder);
		boolean b = f.mkdir();		
		System.out.println("b=" + b);
		
		
		File f1 = null;
		try {
			f1 = new File(folder+"\\$喵兔.txt");
			System.out.println("f1.CreateNewFile()=" + f1.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		try {
			FileOutputStream fos = new FileOutputStream(folder+"\\$喵兔.txt");		
			PrintStream ps = new PrintStream(fos);
			
			ps.println("現在是" + DataUtile.getDateString());			
			ps.println( DataUtile.getTimeString() + "\t 喵兔大神好棒棒!!!");

			ps.close();		
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
			e.printStackTrace();
		}

		File f0 = new File(folder);
		File f2 = new File(f0, "$喵兔.txt");

		if (f2.isFile()) {
			System.out.println(f1.getName() + " ---> 喵兔找到了 !");
		} else {
			System.out.println(f1.getName() + " ---> 喵兔失蹤了 !");
		}
//			if(f2.isFile()==true)
//				
//				try {
//				    Files.write(Paths.get("$喵兔.txt"), "the text".getBytes(), StandardOpenOption.APPEND);
//				}catch (IOException e) {
//				    //exception handling left as an exercise for the reader
//				}

	}



}
