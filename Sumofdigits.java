package Brindha.com;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n,i,sum=0,rem;
		System.out.println("Enter no:");
		n=sc.nextInt();
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of digits:"+sum);
	}
}
