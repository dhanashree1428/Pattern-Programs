package com.jsp.trianglepatterns;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=5;
		  for(int i=n;i>=1;i--) {
			  for(int j=n;j>=i;j--) {
				  System.out.print((char)(96+j));
			  }
			  System.out.println();
	}
	}
}
