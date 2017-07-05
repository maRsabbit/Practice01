package com.javaex.practice;

import java.util.*;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big = 0;
		System.out.println("숫자를 입력하시오.");
		for(int i = 0; i<5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if(num >= big)
				big = num;
		}
		System.out.println("최대값은 "+big+"입니다.");
	}

}
