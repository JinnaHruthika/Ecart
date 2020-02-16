package com.vnrvjiet.Hruthika.Ecart.Electronics;
import java.util.Scanner;
public class Mobile {
	
	public int DisplayAllMobiles()
	{
		int MobileCost=0;
	Scanner s1=new Scanner(System.in);
	String str[]={"IPhoneXR","SAMSUNG","Redmi8"};
	System.out.println("select a mobile that you want");
	System.out.println(" 1.IPhoneXR 2.SAMSUNG 3.Redmi8 ");
	
	int select2=s1.nextInt();
	
	if(select2==1)
	{
		System.out.println("you selected "+str[0]+" and it costs   " +50000);
		MobileCost=50000;
	}
	else if(select2==2)
	{
		System.out.println("you selected "+str[1]+" and it costs   " +20000);
		MobileCost=20000;
	}
	else if(select2==3)
	{
		System.out.println("you selected "+str[2]+"and it costs "+15000);
		MobileCost=15000;
		
	}
	return(MobileCost);
	}


}
