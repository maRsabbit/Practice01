package com.javaex.practice;

import java.util.*;

public class Prac07 {
	public static void main(String[] args) {
		int ran_num = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		boolean i = true;
		System.out.println("==========================");
		System.out.println("\t[���ڸ��߱���� ����]");
		System.out.println("==========================");
		while( i == true) {
			System.out.print(">>");
			int play_num = sc.nextInt();
			if (play_num == ran_num) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("������ �����Ͻðڽ��ϱ�?(y/n) >>");
				String senm_mes = sc.next();
				if("y".equals(senm_mes)) {
					System.out.println("==========================");
					System.out.println("\t[���ڸ��߱���� ����]");
					System.out.println("==========================");
					i =false;
				} else {
					ran_num = (int)(Math.random()*100)+1;
					continue;
				}
			} else if(play_num > ran_num) {
				System.out.println("�� ����");
			} else if(play_num < ran_num){
				System.out.println("�� ����");
				
			}
		}
	}
}
