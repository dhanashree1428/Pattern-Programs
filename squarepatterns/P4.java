package com.jsp.squarepatterns;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5;
   for(int i=1;i<=n;i++) {
	   for(int j=1;j<=n;j++) {
		   //System.out.print(i%2);
	if(i%2==0) {
		System.out.print(0);
	}else {
		System.out.print(1);
	}
	   }System.out.println();
   }
	}

}
