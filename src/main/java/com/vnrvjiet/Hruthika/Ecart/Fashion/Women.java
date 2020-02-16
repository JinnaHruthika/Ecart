package com.vnrvjiet.Hruthika.Ecart.Fashion;
import java.util.*;
public class Women {
	public int DisplayWomenItems()
	{
		int WomenItemCost=0;
	Scanner sc1=new Scanner(System.in);
	int select1;
	String[] s = new String[] {"pink T-shirt","blue jeans","lehanga"};
	System.out.println("select women items that you want");
	System.out.println("1.pink T-shirt 2.blue jeans 3.lehanga");
	
	
	select1=sc1.nextInt();
	
	if(select1==1)
	{
		System.out.println("you selected "+s[0]+" and it costs  " +2000);
		WomenItemCost=2000;
	}
	else if(select1==2)
	{
		System.out.println("you selected "+s[1]+" and it costs   " +3000);
		WomenItemCost=3000;
	}
	else if(select1==3)
	{
		System.out.println("you selected "+s[2]+"  and it costs   "+2500);
		WomenItemCost=2500;
		
	}
	return(WomenItemCost);
	
}
	

}
