package com.agriitex.list;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		for(String i :list)
		{
			System.out.println(i);
		}
		list.clear();
		System.out.println("list:"+list);
	}
}