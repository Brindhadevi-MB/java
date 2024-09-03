package Brindha.com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n,t,rem,sum=0,count=0;
		System.out.print("Enter no:");
		n=sc.nextInt();
		t=n;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			

		}
		if(sum==t) {
			System.out.println(sum +" is Armstrong number");
		}
		else {
			System.out.println(sum +" is not a Armstrong number");
		}
	}

}
