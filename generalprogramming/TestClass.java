package generalprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sun.org.apache.bcel.internal.generic.ObjectType;


public class TestClass {
	
	
	public static  Map<String, String> decode(String s) {
		if(null==s){
		      return null;
		    }
		    if(s.equals("")){
		      return new HashMap<String,String>();    
		    }
		    
		    String text    =
	            "This is the text to be searched " +
	            "for occurrences of the http:// pattern.";

	        String patternString = "";

	        Pattern pattern = Pattern.compile(patternString);

	        Matcher matcher = pattern.matcher(text);
	        boolean matches = matcher.matches();
		    
		    if((){
		    	
		    }
			Map<String, String> map = new HashMap<String, String>();
		      String[] pair = s.split("&");
		      for(String i : pair){
		        String[] keyValuePair=i.split("=");
		        map.put(keyValuePair[0],keyValuePair[1]);
		      }
		      return map;
		}
	
	public static void main(String[] args) {
	
		
		//given
		 String input = "";

		//when
		Map<String, String> result = decode(input);

		//then
		Map<String, String> expected = new HashMap<String, String>();
		expected.put("one", "1");
		expected.put("two", "2");

		System.out.println(decode(input));
		
		
	}

}
