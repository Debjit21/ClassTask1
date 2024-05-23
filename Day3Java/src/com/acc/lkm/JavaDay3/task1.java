package com.acc.lkm.JavaDay3;
import java.util.*;
public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList <Employee> arr= new ArrayList<>();
		
		for(int i=0; i<4; i++) {
			System.out.println("Enter EID, Name, Location");
			String details =sc.nextLine();
			
			arr.add(new Employee(details));
		}
		
		sc.close();
		
		for(Employee e: arr) {
			System.out.println("Details Are : ");
			System.out.println("EID: "+e.eid);
			System.out.println("Name: "+e.ename);
			System.out.println("Location: "+e.location+"\n");
		}

	}

}