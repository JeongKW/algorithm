package com.bit.opcode;

import java.util.Scanner;

public class CalcSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = new String[5];
		arr[0] = "첫번째 숫자를 입력\n";
		arr[1] = "두번째 숫자를 입력\n";
		arr[2] = "연산자를 입력하세요 (+, -, *, /, %)\n";
		int inA = 0, inB = 0, res = 0; 
		String opcode = "";
		boolean inputOk = true;
		System.out.print(arr[0]);
		inA = scanner.nextInt();
		System.out.print(arr[1]);
		inB = scanner.nextInt();
		System.out.print(arr[2]);
		opcode = scanner.next();
		switch(opcode) {
		case "+":
			res = inA + inB;
		case "-":
			res = inA - inB;
		case "*":
			res = inA * inB;
		case "/":
			res = inA / inB;
		case "%":
			res = inA % inB;
		}
		System.out.printf("%d %s %d = %d", inA, opcode, inB, res);
	}
}