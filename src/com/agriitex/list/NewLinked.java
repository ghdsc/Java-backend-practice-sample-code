package com.agriitex.list;

import java.util.LinkedList;
import java.util.List;

public class NewLinked {
	public static void main(String[] args) {
		
	}
	List<LinkedList31> list=new LinkedList<LinkedList31>();  
    //Creating Books  
	NewLinked n = new NewLinked(31,"shashi",);
    Book b2=new Book();  
    Book b3=new Book();  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    for(Book b:list){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
  
}
