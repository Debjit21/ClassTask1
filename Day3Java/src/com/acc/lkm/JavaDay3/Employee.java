package com.acc.lkm.JavaDay3;

public class Employee {
	int eid;
	String ename;
	String location;

	public Employee(String details) {
		String[] det= details.split(" ");
		this.eid=Integer.parseInt(det[0]);
		this.ename=det[1];
		this.location=det[2];
	}
}