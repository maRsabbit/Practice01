package com.javaex.practice;

import java.util.*;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int indata = sc.nextInt();
		for(int i=1; i<=indata; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
