package com.jsp.pyramidpatterns;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;int k=1;
		for(int i=1;i<=n;i++) {
			for(int s=1;s<=n-i;s++) {
			 System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			 System.out.print(k%2);
			 k++;
		}
		for(int j=1;j<=i-1;j++) {
			System.out.print(k%2);
			k--;
		}
		System.out.println();
		}
	}
	}

