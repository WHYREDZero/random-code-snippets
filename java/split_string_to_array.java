// Predict the output

import java.util.StringTokenizer; 
public class split_string_to_array
{ 
   public static void main(String args[]) 
   { 
	StringTokenizer st = new StringTokenizer("JAVA:Code:String", ":", false); //String, delimiter, is delimiter a token too?
	while (st.hasMoreTokens()) 
         System.out.println(st.nextToken()); 
   } 
} 
