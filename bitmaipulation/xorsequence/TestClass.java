package bitmaipulation.xorsequence;

import java.io.*;
import java.util.*;

public class TestClass {

    
    public void whoWon(long number){}
        

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