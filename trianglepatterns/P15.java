package com.jsp.trianglepatterns;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 int n=5;
//	    for(int i=n;i>=1;i--) {
//	    	for(int s=1;s<=i-1;s++) {
//	    		System.out.print(" ");
//	    	}
//	    	for(int j=i;j<=n;j++) {
//	    		System.out.print(j);
//	    	}
//	    	System.out.println();
//	    }
	    
     int n=5;
	for(int i=n;i>=1;i--) {
		for(int s=1;s<=i-1;s++) {
			System.out.print(" ");
		}
		for(int j=i;j<=n;j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	}

}
