// Beth Kieler
// bkiel3
// 11/27/2014

package MakeArffFile;


import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Make8binTESTFile {
	

	public static void main(String[] args) {
		float bin1 = 0, bin2 = 0, bin3 = 0, bin4 = 0, bin5 = 0, bin6 = 0, bin7 = 0, bin8 = 0;
		int red, green, blue;		
		String[] colors;
		int total_pixels;
		
		//open file for reading
		File directory= new File("C:\\Users\\bt5\\Documents\\1-School and cert\\CSC 573 Data Mining\\Final Project\\project_images\\project images\\ztextfilesonly\\sunflower\\test");
		for (File file : directory.listFiles())
		{
			//System.out.println("\n opening new file \n");
			bin1 = 0; 
			bin2 = 0;
			bin3 = 0;
			bin4 = 0; 
			bin5 = 0;
			bin6 = 0;
			bin7 = 0;
			bin8 = 0;
			total_pixels = 0;
			
			//System.out.println(file);
			
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
			    

			    	//System.out.println("red:  " + red + ";  green:  " + green + ";  blue:  " + blue);	
			    	
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
			    	total_pixels++;			    	
			    }
			    
			    //Normalize bin numbers	
			   // System.out.println("Total_pixels = " + total_pixels);
			    bin1 = bin1/total_pixels;
			    bin2 = bin2/total_pixels;
			    bin3 = bin3/total_pixels;
			    bin4 = bin4/total_pixels;
			    bin5 = bin5/total_pixels;
			    bin6 = bin6/total_pixels;
			    bin7 = bin7/total_pixels;
			    bin8 = bin8/total_pixels;
			    
			    BigDecimal num = new BigDecimal(bin1);
			    String Bin1NoExponents = num.toPlainString();
			    num = new BigDecimal(bin2);
			    String Bin2NoExponents = num.toPlainString();
			    num = new BigDecimal(bin3);
			    String Bin3NoExponents = num.toPlainString();
			    num = new BigDecimal(bin4);
			    String Bin4NoExponents = num.toPlainString();
			    num = new BigDecimal(bin5);
			    String Bin5NoExponents = num.toPlainString();
			    num = new BigDecimal(bin6);
			    String Bin6NoExponents = num.toPlainString();
			    num = new BigDecimal(bin7);
			    String Bin7NoExponents = num.toPlainString();
			    num = new BigDecimal(bin8);
			    String Bin8NoExponents = num.toPlainString();
			    
			    //write out to file here
			    BufferedWriter out = null;
			    try  
			    {
			        FileWriter fstream = new FileWriter("bin8TESTinfosunflower.txt", true); //true tells to append data.
			        out = new BufferedWriter(fstream);
			        out.write(Bin1NoExponents + "," + Bin2NoExponents + "," + Bin3NoExponents + "," + Bin4NoExponents + "," + Bin5NoExponents + "," + Bin6NoExponents + "," + Bin7NoExponents + "," + Bin8NoExponents + "\n");
			        
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
		System.out.println("\n\n\n \n\n\n FINISHED \n\n\n");
	}
}
