package com.acc.lkm.JavaDay3;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerManagement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		LinkedList <Customer> arr= new LinkedList<>();
		
			System.out.println("Enter CustID, Name, Product, Price");
			String details =sc.nextLine();
			
			arr.add(new Customer(details));
		
		for(Customer c: arr) {
			System.out.println("Details Are : ");
			System.out.println("CustID: "+c.custId);
			System.out.println("Name: "+c.name);
			System.out.println("Product: "+c.product);
			System.out.println("Price: "+c.price+"\n");
		}

	}

}
