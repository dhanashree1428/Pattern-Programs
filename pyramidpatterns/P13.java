package com.jsp.pyramidpatterns;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=4;int k=1;
   for(int i=1;i<=n;i++) {
	   for(int s=1;s<=n-i;s++) {
		   System.out.print(" ");
	   }
	   for(int j=1;j<=2*i-1;j++) {
		   System.out.print(k%2);
		   k++;
	   }
	   System.out.println();
	   }
   for(int i=n-1;i>=1;i--) {
	   for(int s=1;s<=n-i;s++) {
		   System.out.print(" ");
	   }
	   for(int j=1;j<=2*i-1;j++) {
		   System.out.print(k%2);
		   k++;
	   }
	   System.out.println();
	   }
   }
	}


