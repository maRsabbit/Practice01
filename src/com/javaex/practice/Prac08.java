package com.javaex.practice;

import java.util.*;

public class Prac08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean i = true;
		int sum = 0;
		System.out.println("==========================");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("==========================");
		while( i == true) {
			System.out.print("선택>");
			int sel_num = sc.nextInt();
			switch(sel_num){
			case 1:
				System.out.print("예금액>");
				int despoit = sc.nextInt();
				sum+=despoit;
				break;
			case 2:
				System.out.print("출금액>");
				int withdrawal = sc.nextInt();
				sum-=withdrawal;
				break;
			case 3:
				System.out.print("잔고액>");
				System.out.println(sum);
				break;
			case 4:
				System.out.print("프로그램 종료.");
				i = false;
				break;
			default:
				System.out.println("다시 입력해주세요");
				break;
					
			}
		}
	}
}
