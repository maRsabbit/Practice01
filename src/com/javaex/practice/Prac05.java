package com.javaex.practice;

import java.util.*;

public class Prac05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int big = 0;
		System.out.println("���ڸ� �Է��Ͻÿ�.");
		for(int i = 0; i<5; i++) {
			System.out.print("����: ");
			int num = sc.nextInt();
			if(num >= big)
				big = num;
		}
		System.out.println("�ִ밪�� "+big+"�Դϴ�.");
	}

}
