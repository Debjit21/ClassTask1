package com.acc.lkm.JavaDay3;

public class multiTry {
	
	public static int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		int a=4, b=0;
		int[] arr = new int[4];
		String str = null;
		
		try {
			/*int c=div(a,b);
            System.out.println("Div is: "+c);*/
            
            try {
                System.out.println("Element is: "+arr[5]);
                
            } catch (Exception e) {
                System.out.println("Ex caught!!");
            }
            
            try {
            	System.out.println(str.length());
                
            } catch (Exception e) {
                System.out.println("Ex caught again !!");
            }
            
        } catch (Exception e) {
            System.out.println("Outer try ex caught");
        }

	}

}
