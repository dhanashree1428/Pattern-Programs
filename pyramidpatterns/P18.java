package com.jsp.pyramidpatterns;

public class P18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    for(int i=n;i>=1;i--) {
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    System.out.println();
    }
    for(int i=n-3;i<=n;i++) {
    	for(int j=1;j<=i;j++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }
	}

}
