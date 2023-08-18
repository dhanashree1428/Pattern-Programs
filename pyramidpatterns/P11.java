package com.jsp.pyramidpatterns;

public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		method 1
   int n=7;
   int st=1;
   int sp=n/2;
   
   for(int i=1;i<=n;i++) {
	   for(int s=1;s<=sp;s++) {
		   System.out.print(" ");
	   }
	   for(int j=1;j<=st;j++) {
		   System.out.print("*");
	   }
	   if(i<=n/2) {
		   st=st+2;
		   sp--;
	   }
	   else {
		   st=st-2;
		   sp++;
	   }
	   System.out.println();
   }
////		method 2
//		int n=4;
//		for(int i=1;i<=n;i++) {
//			for(int s=1;s<=n-i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=n-1;i>=1;i--) {
//			for(int s=1;s<=n-i;s++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
