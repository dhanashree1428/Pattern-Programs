package com.jsp.trianglepatterns;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5;
   for(int i=0;i<=n;i++) {
	   for(int j=1;j<=n-i;j++) {
		   System.out.print("*");
	   }
	   System.out.println();
   }
	}

}
