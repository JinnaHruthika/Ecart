package com.vnrvjiet.Hruthika.Ecart.Fashion;
import java.util.*;
public class Men {
	public int DisplayMenItems()
	{
		int MenItemCost=0;
	Scanner s1=new Scanner(System.in);
	String str[]={"Blue shirt","black jeans","black blazzer"};
	System.out.println("select men item that you want");
	System.out.println("1.Blue shirt 2.black jeans 3.black blazzer");
	
	int select2=s1.nextInt();
	
	if(select2==1)
	{
		System.out.println("you selected "+str[0]+" and it costs   " +1000);
		MenItemCost=1000;
	}
	else if(select2==2)
	{
		System.out.println("you selected "+str[1]+" and it costs   " +2000);
		MenItemCost=2000;
	}
	else if(select2==3)
	{
		System.out.println("you selected "+str[2]+"and it costs "+5000);
		MenItemCost=3000;
		
	}
	return(MenItemCost);
	}

}
