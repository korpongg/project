package Frame;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChecKLoginController {
	public boolean checkLogin(String user, String password, File f) {
		try
		{
			
			Scanner s = new Scanner(f);
			
			while (s.hasNext()){
				
		           // String temp=st.nextToken();
		        String  ss1=  s.next();
		            String ss2=s.next();
				if(ss1.equals(user)&&ss2.equals(password))
				{
					return true;
				}
					 
				
		            System.out.println("Next Token "+ss1);
		            System.out.println("Next Token "+ss2);
		 //System.out.println(temp);
		  
		           
			
		}
		s.close();
		}
		catch(Exception e)
		{
			
		}
return false;
}
	public String checkLoginNull(String user, String password, File f) {
		if(f==null)
		{
			return "Not have";
		}
		else
		{
			return "filename.txt";
		}
}
	
	
}
