package com.jsp.trianglepatterns;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   int n=5;int k=1;
//   for(int i=5;i>=1;i--) {
//	   for(int j=n;j>=k;j--) {
//		   System.out.print(j);
//	   }
//	   k++;
//	   System.out.println();
//	}
   int n=5;
   for(int i=1;i<=n;i++) {
	   for(int j=n;j>=i;j--) {
		   System.out.print(j); 
	   }
	   System.out.println();
   }
	}
}


