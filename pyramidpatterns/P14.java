package com.jsp.pyramidpatterns;

public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=4;
  for(int i=1;i<=n;i++) {
	  for(int s=1;s<=n-i;s++) {
		  System.out.print(" ");
	  }
	  int k=1;
	  for(int j=1;j<=2*i-1;j++) {
		  System.out.print(k);
		  if(j<i) {
			  k++;
		  }else {
			  k--;
		  }
	  }
	  System.out.println();
  }
    for(int i=n-1;i>=1;i--) {
    	 for(int s=1;s<=n-i;s++) {
   		  System.out.print(" ");
   	  }
   	  int k=1;
   	  for(int j=1;j<=2*i-1;j++) {
   		  System.out.print(k);
   		  if(j<i) {
   			  k++;
   		  }else {
   			  k--;
   		  }
   	  }
   	  System.out.println();
     }
    }
	}


