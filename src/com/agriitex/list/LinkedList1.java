package com.agriitex.list;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> l1 = new LinkedList<>();

		l1.add("haJhfjf");
		l1.add("sdnfjf");
		l1.add("dsfnjjf");
		l1.add("jdhfa");
		l1.add("msfhoh");
		l1.add("skfh");
		l1.addFirst("FIIWfwhfu");
		l1.addLast("jfu");

		for (String str : l1) {

			System.out.println(str + "");
			System.out.println(l1.getFirst());

			
		}
		
		Employee e1 = new Employee();
		e1.setEid(10);
		e1.setEname("yellaiah");
		e1.setEsalary(10000);
		//Employee e2 = new Employee();
		Employee e2 = e1;
		e2.setEid(10);
		e2.setEname("yellaiah");
		e2.setEsalary(10000);
		System.out.println("hashcode1 : " + e1.hashCode());
		System.out.println("hashcode2 : " + e2.hashCode());
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		
		long count = 0;
		while(true) {
			count++;
			System.out.println("count "+count);
		}

	}
}
