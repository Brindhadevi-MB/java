package Brindha.com;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int i,n,f1=0,f2=1,f3;
		System.out.println("Enter the number:");
		n=sc.nextInt();
		for(i=1;i<=n;i++) {
			f3=f1+f2;
			System.out.println(f1);
			f1=f2;
			f2=f3;
		}
		
	}
		
}
