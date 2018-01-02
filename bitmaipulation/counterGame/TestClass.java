package bitmaipulation.counterGame;

import java.io.*;
import java.util.*;

public class TestClass {
	boolean loiuseFlag=false;
	
	public static int highestPowerof2(int n)
    {
        int res = 0;
        for (int i=n; i>=1; i--)
        {
            // If i is a power of 2
            if ((i & (i-1)) == 0)
            {
                res = i;
                break;
            }
        }
        return res;
    }
    
    public void whoWon(long number){
           if(number==1){
        	   number=0;
               if(loiuseFlag==true){
                   System.out.println("Louise");
               }
               else{
            	   System.out.println("Richard");
               }
           }
           
           else{
           String binaryString = Long.toBinaryString(number);
           
           if(Long.parseLong(binaryString.substring(1,binaryString.length()),2)==0)
        	   number = number/2;
           else{
        	   long check = Long.parseLong(binaryString,2);
        	   String newString1="1";
        	   
        	   
        	   for(int i =1 ; i <binaryString.length(); i++){
        		   newString1=newString1+"0";
        	   }
        	   
        	   long checkNumber = Long.parseLong(newString1,2);
        	   number = number-checkNumber;
           }
           
           
           if(loiuseFlag==true){
        	   loiuseFlag=false;
           }
           else{
        	   loiuseFlag=true;
           }
           
        	   
           if(number!=0)
           whoWon(number);
           }
        }
        

        public static void main(String[] args) {
            
        	File file = new File("D:/workspace/cards/PublishCMS/src/com/i2c/cms/input.txt");
        	Scanner in=null;
			try {
				in = new Scanner(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            int number = in.nextInt();
            for(int i = 0;i<number; i++)
            new TestClass().whoWon(in.nextLong());
        }
    

  
}