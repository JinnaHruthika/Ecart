package com.vnrvjiet.Hruthika.Ecart;

import java.util.Scanner;

import com.vnrvjiet.Hruthika.Ecart.Electronics.Laptop;
import com.vnrvjiet.Hruthika.Ecart.Electronics.Mobile;
import com.vnrvjiet.Hruthika.Ecart.Fashion.Men;
import com.vnrvjiet.Hruthika.Ecart.Fashion.Women;

public class App 
{
    public static void main( String[] args )
    {
    	int Cost=0;
   	 Men men=new Men();
        Women women=new Women();
        Mobile mobile=new Mobile();
        Laptop laptop=new Laptop();    
   	Scanner sc=new Scanner(System.in);
      int ch=0;
     while(ch==0)
     {
   	  System.out.println(" select option ");
    	 System.out.println(" 1.men fashion 2.women fashion 3.MobilePhones 4.Laptops ");
       int SelectOption=sc.nextInt();
      switch(SelectOption)
      {
      case 1:int ItemCost1=men.DisplayMenItems();
      Cost=Cost+ ItemCost1;
       break;
      case 2:int ItemCost2=women.DisplayWomenItems();
      Cost=Cost+ ItemCost2;
      break;
      case 3:int ItemCost3=mobile.DisplayAllMobiles();
      Cost=Cost+ ItemCost3;
      break;
      case 4:int ItemCost4=laptop.DisplayAllLaptops();
      Cost=Cost+ItemCost4;
      break;
   }
      System.out.println("Want To Continue IN Purchasing Items......Press 0");
      ch=sc.nextInt();
     }
     System.out.println("Total purcahesed Items Cost -> "+Cost);
   
    }
}
