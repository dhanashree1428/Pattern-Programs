package com.jsp.trianglepatterns;

public class P18{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  int n=5;
//  for(int i=n;i>=1;i--) {
//	  for(int s=1;s<=n-i;s++) {
//		  System.out.print(" ");
//	  }
//	  for(int j=1;j<=i;j++) {
//		  System.out.print("*");
//	  }
//	  System.out.println();
//  }
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
			System.out.println();
 }}
}
