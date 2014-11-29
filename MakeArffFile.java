// Beth Kieler
// bkiel3
// 11/27/2014

package MakeArffFile;

//import java.*;
import java.io.*;
import java.util.*;
//import java.math.*;
//import java.lang.*;

public class MakeArffFile {
	

	public static void main(String[] args) {
		int bin1 = 0, bin2 = 0, bin3 = 0, bin4 = 0, bin5 = 0, bin6 = 0, bin7 = 0, bin8 = 0;
		int red, green, blue;		
		String[] colors;
		
		//open file for reading
		File directory= new File("C:\\Users\\bt5\\Documents\\1-School and cert\\CSC 573 Data Mining\\Final Project\\project_images\\project images\\ztextfilesonly\\airplane\\training");
		for (File file : directory.listFiles())
		{
			System.out.println("\n opening new file \n");
			bin1 = 0; 
			bin2 = 0;
			bin3 = 0;
			bin4 = 0; 
			bin5 = 0;
			bin6 = 0;
			bin7 = 0;
			bin8 = 0;
			
			System.out.println(file);
			
		   BufferedReader reader = null;
			try {
				//read file
			    
				reader = new BufferedReader(new FileReader(file));
			    String text = null;
			    
			    while ((text = reader.readLine()) != null) {
			    	//parse the line read from the file
			    	colors = text.split("[,]+");
			    	red = Integer.parseInt(colors[0]);
			    	blue = Integer.parseInt(colors[1]);
			    	green = Integer.parseInt(colors[2]);
			    

			    	System.out.println("red:  " + red + ";  green:  " + green + ";  blue:  " + blue);	
			    	
			    	if ((red >= 0) && (red < 128) && (green >= 0) && (green < 128) && (blue >= 0) && (blue < 128)){
			    		bin1++;	    					    		
			    	}
			    	else if((red >= 0) && (red < 128) && (green >= 0) && (green < 128) && (blue >= 128) && (blue < 256)){
			    		bin2++;
			    	}
			    	else if((red >= 0) && (red < 128) && (green >= 128) && (green < 256) && (blue >= 0) && (blue < 128)){
			    		bin3++;
			    	}			    	
			    	else if((red >= 0) && (red < 128) && (green >= 128) && (green < 256) && (blue >= 128) && (blue < 256)){
			    		bin4++;
			    	}
			    	else if((red >= 128) && (red < 256) && (green >= 0) && (green < 128) && (blue >= 0) && (blue < 128)){
			    		bin5++;
			    	}
			    	else if((red >= 128) && (red < 256) && (green >= 0) && (green < 128) && (blue >= 128) && (blue < 256)){
			    		bin6++;
			    	}			    	
			    	else if((red >= 128) && (red < 256) && (green >= 128) && (green < 256) && (blue >= 0) && (blue < 128)){
			    		bin7++;
			    	}			    	
			    	else if((red >= 128) && (red < 256) && (green >= 128) && (green < 256) && (blue >= 128) && (blue < 256)){
			    		bin8++;
			    	}
			    
			    	else {
			    		System.out.println("FAILED BIN ASSIGNMENT");
			  		  	System.out.println("\n\nPress num to continue..");
						Scanner sc1 = new Scanner(System.in);
						int i1 = sc1.nextInt();
						System.out.println(i1);
						sc1.close();
			    	}
			    	
			    	
			    	System.out.println("bin1:  " + bin1 + "\nbin2:  "+ bin2 + "\nbin3:  " + bin3 + "\nbin4:  " + bin4 + 
			    			"\nbin5:  " + bin5 + "\nbin6:  " + bin6 + "\nbin7:  " + bin7 + "\nbin8:  " + bin8); 		
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
		}
		sc.close();
	}
}
