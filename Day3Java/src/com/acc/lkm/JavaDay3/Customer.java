package com.acc.lkm.JavaDay3;

public class Customer {
	
	int custId, price;
	String name, product;

	Customer(String details) {
		
		String[] det= details.split(" ");
		this.custId=Integer.parseInt(det[0]);
		this.name=det[1];
		this.product=det[2];
		this.price=Integer.parseInt(det[3]);
	}
}
