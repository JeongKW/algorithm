package com.bit.opcode;

import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int inA = 0, inB = 0, res = 0;		
		String opcode = "";
		System.out.println("첫번째 숫자 입력");
		inA = scanner.nextInt();
		System.out.println("두번째 숫자 입력");
		inB = scanner.nextInt();
		System.out.println("연산자를 입력하세요. (+, -, *, /, %)");
		opcode = scanner.next();
		if(opcode.equals("+")) {
			res = inA + inB;
		} else if(opcode.equals("-")){
			res = inA - inB;
		} else if(opcode.equals("*")) {
			res = inA * inB;
		} else if(opcode.equals("/")) {
			res = inA / inB;
		} else {
			res = inA % inB;
		}
		System.out.print(inA + " " + opcode + " " + inB + " = " + res);
	}
}