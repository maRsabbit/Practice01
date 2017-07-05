package com.javaex.practice;

import java.util.*;

public class Prac07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean i = true;
		System.out.println("==========================");
		System.out.println("\t[숫자맞추기 게임 시작]");
		System.out.println("==========================");
		while (i == true) {
			int ran_num = (int) (Math.random() * 100) + 1;
			boolean j = true;
			while (j == true) {
				System.out.print(">>");
				int play_num = sc.nextInt();
				if (play_num == ran_num) {
					System.out.println("맞았습니다..");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");
					String senm_mes = sc.next();
					if ("y".equals(senm_mes)) {
						System.out.println("==========================");
						System.out.println("\t[숫자맞추기 게임 종료]");
						System.out.println("==========================");
						i = false;
						j = false; 
					} else {
						j = false;
					}
				} else if (play_num > ran_num) {
					System.out.println("더 낮게");
				} else if (play_num < ran_num) {
					System.out.println("더 높게");
				}
			}
		}
	}
}
