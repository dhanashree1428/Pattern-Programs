package com.jsp.pyramidpatterns;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=4;
   for(int i=n;i>=1;i--) {
	   for(int s=1;s<=i-1;s++) {
		   System.out.print(" ");
	   }
	   int k=i;
	  for(int j=i;j<=n;j++) {
		   System.out.print(k);
		if(j<n) {
			k++;
		}else {
			k--;
		}
		}
       System.out.println();
   }
	  
   }
    
	}


