package com.jsp.pyramidpatterns;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    for(int i=n;i>=1;i--) {
    	for(int s=1;s<=n-i;s++) {
    		System.out.print(" ");
    	}
    	for(int j=1;j<=2*i-1;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
		
//		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int s=1;s<=i-1;s++) {
//				System.out.print(" ");
//			}
//		for(int j=1;j<=1;j--) {
//			System.out.print("*");
//		}
//		for(int j=n-i;j>=1;j--) {
//			System.out.print(j);
//		}
		System.out.println();
		}
	}


