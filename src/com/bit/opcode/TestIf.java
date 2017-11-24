package com.bit.opcode;

import java.util.Scanner;

public class TestIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int age = 0, res = 0;
		System.out.print("\t나이를 입력\n");
		age = scanner.nextInt();
		res = age / 10;
		if(res >= 1 && res < 2) {
			System.out.print("10대");
		} else if(res >= 2 && res < 3) {
			System.out.print("20대");
		} else if(res >= 3 && res < 4) {
			System.out.print("30대");
		} else if(res >= 4 && res < 5) {
			System.out.print("40대");
		} else if(res >= 5 && res < 6) {
			System.out.print("50대");
		} else if(res >= 6 && res < 7) {
			System.out.print("60대");
		} else if(res >= 7 && res < 8) {
			System.out.print("70대");
		} else if(res >= 8 && res < 9) {
			System.out.print("80대");
		} else if(res >= 9 && res < 10) {
			System.out.print("90대");
		}
	}
}
