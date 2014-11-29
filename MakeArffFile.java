// Beth Kieler
// bkiel3
// 11/27/2014

package MakeArffFile;

import java.*;
import java.io.*;
import java.util.*;

public class MakeArffFile {
	

	public static void main(String[] args) {
		int bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8;
		String pictureClass; 
		//int[] colors;
		
		//open file for reading
		List<Integer> colors = new ArrayList<Integer>();
		String[] colors1;
		int[] colors2 = new int[3];
		
		File directory= new File("C:\\Users\\bt5\\Documents\\1-School and cert\\CSC 573 Data Mining\\Final Project\\project_images\\project images\\ztextfilesonly\\airplane\\training");
		for (File file : directory.listFiles())
		{
		   BufferedReader reader = null;
			try {
			    reader = new BufferedReader(new FileReader(file));
			   // int i = 0;
			    String text = null;
	int k = 1;
			    while ((text = reader.readLine()) != null) {
			    	System.out.println("been through while " + k + " times.");
			    	k++;
			    	System.out.println(text);
	
			    	colors1 = text.split("[,]+");
			    	for (int i = 0; i < colors1.length; i++){
			    		colors2[i] = Integer.parseInt(colors1[i]);
			    		System.out.println(colors2[i]);
			    		
			    	}
			    }
			} catch (FileNotFoundException e) {
			    e.printStackTrace();
			} catch (IOException e) {
			    e.printStackTrace();
			} finally {
			    try {
			        if (reader != null) {
			            reader.close();
			        }
			    } catch (IOException e) {
			    }
			}
	
			
			
			
			//take first 3 and assign to r,g, and b
			
			//analyze to see what bin it falls in
			
			//add 1 to appropriate bin
		
		
		
		
		
		}
		
		
	}

}
