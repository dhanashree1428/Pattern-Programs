package com.jsp.trianglepatterns;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=5;
    for(int i=n;i>=1;i--) {
    	for(int s=1;s<=i-1;s++) {
    		System.out.print(" ");
    	}
    	for(int j=n;j>=i;j--) {
    		System.out.print(j);
    	}
    	System.out.println();
    }
//    for(int i=1;i<=n;i++) {
//    	for(int s=1;s<=n-i;s++) {
//    		System.out.print(" ");
//    	}
//    	for (int j=5;j>n-i;j--) {
//    		System.out.print(j);
//    	}
//    	System.out.println();
    }
}


