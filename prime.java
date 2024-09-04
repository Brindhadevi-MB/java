package Brindha.com;

import java.util.Scanner;

public class chk {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
//		int n=121,rem,rev=0;
//		int t=n;
//		while(n!=0) 
//		{
//		 rem=n%10;
//		 rev=rev*10+rem;
//		 n=n/10;
//		}
//		if(t==rev) {
//			System.out.println(t+"palindrome");
//		}
//		else {
//			System.out.println(t+"not");
//		}
		int i,n,flag=0;
		System.out.print("Enter no:");
		n=sc.nextInt();
		if(n==0||n==1)
			flag=1;
		for(i=2;i<n/2;i++) {
			if(n%i==0)
				flag=1;
			break;
		}
		 
	if(flag==0) {
		System.out.println(n+" is a prime number");
		
		}
	else {
		System.out.println(n+" is not a prime number");
	}

}

}
