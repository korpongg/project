package Frame;

public class Grade {

	double num;
	double n1,n2,n3,n4,n5,n6,n7;
	public Grade()
	{
		
	}
	public void setNum(double n1,double n2,double n3,double n4,double n5,double n6,double n7)
	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		this.n4=n4;
		this.n5=n5;
		this.n6=n6;
		this.n7=n7;
		//this.n8=n8;
	}
	public String getGrade(double num)
	{
		/*System.out.println("sdasdsadasd====   "+num);
		System.out.println("sdasdsadasd11111====   "+n1);
		System.out.println("sdasdsadasd222====   "+n2);
		System.out.println("sdasdsadasd3333===2=   "+n3);
		System.out.println("sdasdsadasd4444====   "+n4);
		System.out.println("sdasdsadasd5555====   "+n5);
		System.out.println("sdasdsadasd666====   "+n6);
		System.out.println("sdasdsadasd77777====   "+n7);*/
		if(num>=n1)
		{
			return "A";
		}
		if(num>=n2&&num<n1)
		{
			return "B+";
		}
		if(num>=n3&&num<n2)
		{
			return "B";
		}
		if(num>=n4&&num<n3)
		{
			return "C+";
		}
		if(num>=n5&&num<n4)
		{
			return "C";
		}
		if(num>=n6&&num<n5)
		{
			return "D+";
		}
		if(num>=n7&&num<n6)
		{
			return "D";
		}
		else
		{
			return "F";
		}
	}
}
