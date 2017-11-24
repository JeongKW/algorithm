package com.bit.opcode;

public class TestLU {
	public static void main(String[] args) {
		char inStr;
		inStr = args[0].charAt(0);
		String res = "";
		
		if(inStr >= '0' && inStr <='9') {
			res = "숫자";
		} else if(inStr >= 'A' && inStr <= 'Z') {
			res = "대문자";
		} else if(inStr >= 'a' && inStr <= 'z') {
			res = "소문자";
		}
		System.out.print(res);
	}
}
