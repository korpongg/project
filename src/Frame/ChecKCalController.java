package Frame;

import java.io.File;

public class ChecKCalController {
	public boolean checkCal(String s) {
		
		
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				switch(c)
				{
				case '1':break;
				case '2':break;
				case '3':break;
				case '4':break;
				case '5':break;
				case '6':break;
				case '7':break;
				case '8':break;
				case '9':break;
				case '0':break;
				default:return false;
				}
				
			}
			return true;
		
	}
	public double checkNotNum(String s) {
		
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			switch(c)
			{
			case '1':break;
			case '2':break;
			case '3':break;
			case '4':break;
			case '5':break;
			case '6':break;
			case '7':break;
			case '8':break;
			case '9':break;
			case '0':break;
			default:return 0;
			}
			
		}
		return Double.parseDouble(s);
	
}
	
	public double checkNull(String s) {
		
		if(s==null)
		{
			return 0;
		}
		return Double.parseDouble(s);
	
}
	
public double checkNotHaveWord(String s) {
		
		if(s=="")
		{
			return 0;
		}
		return Double.parseDouble(s);
	
}
}
