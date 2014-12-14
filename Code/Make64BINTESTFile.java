// Beth Kieler
// bkiel3
// 11/30/2014

package MakeArffFile;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Make64BINTESTFile {
	public static void main(String[] args) {
		
		float[] bin = new float[64];
		int red, green, blue;		
		String[] colors;
		String[] bin_nox = new String[64]; //this is the normalized bin results without exponents
		BigDecimal num;
		int total_pixels;
		
		//open file for reading
		File directory= new File("C:\\Users\\bt5\\Documents\\1-School and cert\\CSC 573 Data Mining\\Final Project\\project_images\\project images\\ztextfilesonly\\sunflower\\test");
		for (File file : directory.listFiles())
		{
			for (int i = 0; i < 64; i++){
				bin[i] = 0;
			}
			total_pixels = 0;			
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
			    			    	
			    	if ((red >= 0) && (red < 64)){
			    		if ((green >= 0) && (green < 64)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[0]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[1]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[2]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[3]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 64
			    		if ((green >= 64) && (green < 128)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[4]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[5]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[6]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[7]++;	
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 128
			    		if ((green >= 128) && (green < 192)){
			    			if ((blue >= 0) && (blue < 64)){
			    					bin[8]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[9]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[10]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[11]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 192
			    		if ((green >= 192) && (green < 256)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[12]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[13]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[14]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[15]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 256
			    	} // end red between 0 and 64
			    	if ((red >= 64) && (red < 128)){
			    		if ((green >= 0) && (green < 64)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[16]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[17]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[18]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[19]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 64
			    		if ((green >= 64) && (green < 128)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[20]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[21]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[22]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[23]++;	
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 128
			    		if ((green >= 128) && (green < 192)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[24]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[25]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[26]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[27]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 192
			    		if ((green >= 192) && (green < 256)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[28]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[29]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[30]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[31]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 256
			    	} // end red between 64 and 128
			    	if ((red >= 128) && (red < 192)){
			    		if ((green >= 0) && (green < 64)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[32]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[33]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[34]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[35]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 64
			    		if ((green >= 64) && (green < 128)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[36]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[37]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[38]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[39]++;	
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 128
			    		if ((green >= 128) && (green < 192)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[40]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[41]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[42]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[43]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 192
			    		if ((green >= 192) && (green < 256)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[44]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[45]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[46]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[47]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 256
			    	} // end red between 128 and 192
			    	if ((red >= 192) && (red < 256)){
			    		if ((green >= 0) && (green < 64)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[48]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[49]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[50]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[51]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 64
			    		if ((green >= 64) && (green < 128)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[52]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[53]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[54]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[55]++;	
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 128
			    		if ((green >= 128) && (green < 192)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[56]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[57]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[58]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[59]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 192
			    		if ((green >= 192) && (green < 256)){
			    			if ((blue >= 0) && (blue < 64)){
			    				bin[60]++;
			    			}
			    			else if ((blue >= 64) && (blue < 128)){
			    				bin[61]++;
			    			}
			    			else if ((blue >= 128) && (blue < 192)){
			    				bin[62]++;
			    			}
			    			else if ((blue >= 192) && (blue < 256)){
			    				bin[63]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 256
			    	} // end red between 192 and 256 		
			    	total_pixels++;
			    }
			    // Normalize
			    for (int i = 0; i < 64; i++){
					bin[i] = bin[i]/total_pixels;
					num = new BigDecimal(bin[i]);
					bin_nox[i] = num.toPlainString();
					
				}
			    
			    //write out to file 
			    BufferedWriter out = null;
			    try  
			    {
			        FileWriter fstream = new FileWriter("bin64TESTinfo_sunflower.txt", true); //true tells to append data.
			        out = new BufferedWriter(fstream);
			        for(int i = 0; i < 64; i++){
			        	if(i < 63){
			        		out.write(bin_nox[i] + ",");
			        	}
			        	else{
			        		out.write(bin_nox[i] + "\n");
			        	}
			        }
			        
			    }
			    catch (IOException e)
			    {
			        System.err.println("Error: " + e.getMessage());
			    }
			    finally
			    {
			        if(out != null) {
			            out.close();
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
		}
		System.out.println("\n\n\n FINISHED \n\n\n");
	}
}
