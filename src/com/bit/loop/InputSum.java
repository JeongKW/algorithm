package com.bit.loop;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0, sum = 0;
		String opcode = "";
		while(true) {
			System.out.print("아무숫자나 입력하세요. 종료(0) : ");
			input = scanner.nextInt();
			if(input == 0) {
				break;
			} else {
				System.out.print("연산자 입력(+, -) : ");
				opcode = scanner.next();
				if(opcode.equals("+")) {
					sum += input;
				} else {
					sum -= input;
				}
			}
		}
		System.out.println("결과는 " + sum + " 입니다.");
	}
}
