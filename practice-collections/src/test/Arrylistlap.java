package test;

import java.util.ArrayList;
import java.util.HashSet;

public class Arrylistlap {

	public static void main(String[] args) {
	ArrayList<Laptop> laptopdetails=new ArrayList<>();
	   Laptop l1=new Laptop(12,"dell","intel");
	   laptopdetails.add(l1);
	   Laptop l2=new Laptop(13,"lenovo","core");
	   laptopdetails.add(l2);
	   Laptop l3=new Laptop(114,"Apple","snapdragon");
	   laptopdetails.add(l3);
	   Laptop l4=new Laptop(117,"hp","sadads");
	   laptopdetails.add(l4);
	   Laptop l5=new Laptop(119,"rr","etete");
	   laptopdetails.add(l5);

	   for( Laptop i :laptopdetails) {
		         System.out.println(i);
	   }
	   int laptop = 2;

	Laptop c = laptopdetails.get( laptop);
	c.setLmodel("jdfdsjgj");
	laptopdetails.get(2).setLmodel("jdfdsjgj");
	
	   
	   
	     System.out.println("after update");
	   
	   for( Laptop i :laptopdetails) {
	         System.out.println(i);
 }
	}
}
	   
		  
		  
	
	   
	      
	   
	   
