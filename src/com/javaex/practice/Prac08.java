package com.javaex.practice;

import java.util.*;

public class Prac08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean i = true;
		int sum = 0;
		System.out.println("==========================");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("==========================");
		while( i == true) {
			System.out.print("����>");
			int sel_num = sc.nextInt();
			switch(sel_num){
			case 1:
				System.out.print("���ݾ�>");
				int despoit = sc.nextInt();
				sum+=despoit;
				break;
			case 2:
				System.out.print("��ݾ�>");
				int withdrawal = sc.nextInt();
				sum-=withdrawal;
				break;
			case 3:
				System.out.print("�ܰ��>");
				System.out.println(sum);
				break;
			case 4:
				System.out.print("�����մϴ�.");
				i = false;
				break;
			default:
				System.out.println("�ٽ� �Է����ּ���");
				break;
					
			}
		}
	}
}
