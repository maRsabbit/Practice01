package com.javaex.practice;

import java.util.Scanner;

public class Prac06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		int num = sc.nextInt();
		if(num%2 ==0 ) {
			for(int i=2; i<=num; i+=2) {
				sum += i; 
			}
		} else if(num %2 == 1) {
			for(int i=1; i<=num; i+=2) {
				sum += i; 
			}
		}
		System.out.println("����� : "+sum);
	}
}
