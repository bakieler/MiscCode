// Beth Kieler
// bkiel3
// 11/30/2014

package MakeArffFile;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Make512binTESTFile {
	public static void main(String[] args) {
		
		float[] bin = new float[512];
		int red, green, blue;		
		String[] colors;
		String[] bin_nox = new String[512]; //this is the normalized bin results without exponents
		BigDecimal num;
		int total_pixels;
		
		//open file for reading
		File directory= new File("C:\\Users\\bt5\\Documents\\1-School and cert\\CSC 573 Data Mining\\Final Project\\project_images\\project images\\ztextfilesonly\\sunflower\\test");
		for (File file : directory.listFiles())
		{
			//System.out.println("\n opening new file \n");
			for (int i = 0; i < 512; i++){
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
			    			    	
			    	/*  PUT START OF IF STATEMENTS HERE	 */
			    	if ((red >= 0) && (red < 32)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[0]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[1]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[2]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[3]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[4]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[5]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[6]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[8]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[9]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[10]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[11]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[12]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[13]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[14]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[16]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[17]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[18]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[19]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[20]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[21]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[22]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[24]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[25]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[26]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[27]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[28]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[29]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[30]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[32]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[33]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[34]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[35]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[36]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[37]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[38]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[40]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[41]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[42]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[43]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[44]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[45]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[46]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[48]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[49]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[50]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[51]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[52]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[53]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[54]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[56]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[57]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[58]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[59]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[60]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[61]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[62]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
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
			    		}// end green between 224 and 256
			    	} //end red between 0 and 32
			    	if ((red >= 32) && (red < 64)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[64]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[65]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[66]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[67]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[68]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[69]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[70]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[71]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[72]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[73]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[74]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[75]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[76]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[77]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[78]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[79]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[80]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[81]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[82]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[83]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[84]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[85]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[86]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[87]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[88]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[89]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[90]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[91]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[92]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[93]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[94]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[95]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[96]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[97]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[98]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[99]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[100]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[101]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[102]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[103]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[104]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[105]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[106]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[107]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[108]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[109]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[110]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[111]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[112]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[113]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[114]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[115]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[116]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[117]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[118]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[119]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[120]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[121]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[122]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[123]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[124]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[125]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[126]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[127]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 32 and 64
			    	if ((red >= 64) && (red < 96)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[128]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[129]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[130]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[131]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[132]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[133]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[134]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[135]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[136]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[137]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[138]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[139]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[140]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[141]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[142]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[143]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[144]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[145]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[146]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[147]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[148]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[149]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[150]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[151]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[152]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[153]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[154]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[155]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[156]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[157]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[158]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[159]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[160]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[161]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[162]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[163]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[164]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[165]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[166]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[167]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[168]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[169]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[170]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[171]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[172]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[173]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[174]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[175]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[176]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[177]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[178]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[179]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[180]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[181]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[182]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[183]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[184]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[185]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[186]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[187]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[188]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[189]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[190]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[191]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 64 and 96 
			    	if ((red >= 96) && (red < 128)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[192]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[193]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[194]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[195]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[196]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[197]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[198]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[199]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[200]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[201]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[202]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[203]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[204]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[205]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[206]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[207]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[208]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[209]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[210]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[211]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[212]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[213]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[214]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[215]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[216]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[217]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[218]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[219]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[220]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[221]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[222]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[223]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[224]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[225]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[226]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[227]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[228]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[229]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[230]++;  
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[231]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[232]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[233]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[234]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[235]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[236]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[237]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[238]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[239]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[240]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[241]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[242]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[243]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[244]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[245]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[246]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[247]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[248]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[249]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[250]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[251]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[252]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[253]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[254]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[255]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 96 and 128
			    	if ((red >= 128) && (red < 160)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[256]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[257]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[258]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[259]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[260]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[261]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[262]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[263]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[264]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[265]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[266]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[267]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[268]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[269]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[270]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[271]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[272]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[273]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[274]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[275]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[276]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[277]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[278]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[279]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[280]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[281]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[282]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[283]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[284]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[285]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[286]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[287]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[288]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[289]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[290]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[291]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[292]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[293]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[294]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[295]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[296]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[297]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[298]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[299]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[300]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[301]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[302]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[303]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[304]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[305]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[306]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[307]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[308]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[309]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[310]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[311]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[312]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[313]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[314]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[315]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[316]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[317]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[318]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[319]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 128 and 160
			    	if ((red >= 160) && (red < 192)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[320]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[321]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[322]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[323]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[324]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[325]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[326]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[327]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[328]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[329]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[330]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[331]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[332]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[333]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[334]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[335]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[336]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[337]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[338]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[339]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[340]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[341]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[342]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[343]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[344]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[345]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[346]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[347]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[348]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[349]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[350]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[351]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[352]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[353]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[354]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[355]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[356]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[357]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[358]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[359]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[360]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[361]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[362]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[363]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[364]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[365]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[366]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[367]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[368]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[369]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[370]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[371]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[372]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[373]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[374]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[375]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[376]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[377]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[378]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[379]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[380]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[381]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[382]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[383]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 160 and 192
			    	if ((red >= 192) && (red < 224)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[384]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[385]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[386]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[387]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[388]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[389]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[390]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[391]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[392]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[393]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[394]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[395]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[396]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[397]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[398]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[399]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[400]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[401]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[402]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[403]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[404]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[405]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[406]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[407]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[408]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[409]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[410]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[411]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[412]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[413]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[414]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[415]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[416]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[417]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[418]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[419]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[420]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[421]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[422]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[423]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[424]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[425]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[426]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[427]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[428]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[429]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[430]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[431]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[432]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[433]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[434]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[435]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[436]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[437]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[438]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[439]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[440]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[441]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[442]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[443]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[444]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[445]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[446]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[447]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 192 and 224
			    	if ((red >= 224) && (red < 256)){
			    		if ((green >= 0) && (green < 32)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[448]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[449]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[450]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[451]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[452]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[453]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[454]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[455]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 0 and 32
			    		if ((green >= 32) && (green < 64)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[456]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[457]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[458]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[459]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[460]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[461]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[462]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[463]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 32 and 64	
			    		if ((green >= 64) && (green < 96)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[464]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[465]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[466]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[467]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[468]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[469]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[470]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[471]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 64 and 96	
			    		if ((green >= 96) && (green < 128)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[472]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[473]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[474]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[475]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[476]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[477]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[478]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[479]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 96 and 128	
			    		if ((green >= 128) && (green < 160)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[480]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[481]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[482]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[483]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[484]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[485]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[486]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[487]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 128 and 160
			    		if ((green >= 160) && (green < 192)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[488]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[489]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[490]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[491]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[492]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[493]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[494]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[495]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 160 and 192	
			    		if ((green >= 192) && (green < 224)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[496]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[497]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[498]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[499]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[500]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[501]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[502]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[503]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 192 and 224	
			    		if ((green >= 224) && (green < 256)){
			    			if ((blue >= 0) && (blue < 32)){
			    				bin[504]++;
			    			}
			    			else if ((blue >= 32) && (blue < 64)){
			    				bin[505]++;
			    			}
			    			else if ((blue >= 64) && (blue < 96)){
			    				bin[506]++;
			    			}
			    			else if ((blue >= 96) && (blue < 128)){
			    				bin[507]++;
			    			}
			    			else if ((blue >= 128) && (blue < 160)){
			    				bin[508]++;
			    			}
			    			else if ((blue >= 160) && (blue < 192)){
			    				bin[509]++;
			    			}
			    			else if ((blue >= 192) && (blue < 224)){
			    				bin[510]++;
			    			}
			    			else if ((blue >= 224) && (blue < 256)){
			    				bin[511]++;
			    			}
			    			else{
			    				System.out.println("FAILED BIN ASSIGNMENT");
			    				System.out.println("\n\nPress num to continue..");
			    				Scanner sc1 = new Scanner(System.in);
			    				int i1 = sc1.nextInt();
			    				System.out.println(i1);
			    				sc1.close();
			    			}
			    		}// end green between 224 and 256
			    	} //end red between 224 and 256
			    	total_pixels++;
			    	/*  END OF IF STATEMENTS */
			    }
			    // Normalize
			    for (int i = 0; i < 512; i++){
					bin[i] = bin[i]/total_pixels;
					num = new BigDecimal(bin[i]);
					bin_nox[i] = num.toPlainString();
				} 
			    //write out to file 
			    BufferedWriter out = null;
			    try  
			    {
			        FileWriter fstream = new FileWriter("bin512TESTinfo_sunflower.txt", true); //true tells to append data.
			        out = new BufferedWriter(fstream);
			        for(int i = 0; i < 512; i++){
			        	if(i < 511){
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
