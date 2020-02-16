package com.vnrvjiet.Hruthika.Ecart.Electronics;
import java.util.Scanner;
public class Laptop {
	public int DisplayAllLaptops()
	{
		int LaptopCost=0;
	Scanner s1=new Scanner(System.in);
	String str[]={"Lenovo","Dell","Apple"};
	System.out.println("select a laptop that you want");
	System.out.println("1.Lenovo 2.Dell 3.Apple");
	
	int select2=s1.nextInt();
	
	if(select2==1)
	{
		System.out.println("you selected "+str[0]+" and it costs   " +50000);
		LaptopCost=50000;
	}
	else if(select2==2)
	{
		System.out.println("you selected "+str[1]+" and it costs   " +20000);
		LaptopCost=20000;
	}
	else if(select2==3)
	{
		System.out.println("you selected "+str[2]+"and it costs "+15000);
		LaptopCost=15000;
		
	}
	return(LaptopCost);
	}
}
