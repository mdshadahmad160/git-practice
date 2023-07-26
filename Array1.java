package com.practice.pckg1;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Size In An Array: ");
		int size=sc.nextInt();
		int [] ar=new int[size];
		System.out.println("Enter "+size+ " values: " );
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter User An Array is : ");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
