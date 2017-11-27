package com.bit.loop;
/*
 * Algorithm 11번 문제
 * 1-2+3-4+5-6...+99-100
 */
public class ArithmeticSequenc11 {
	public static void main(String[] args) {
		String str = "";
		int res = 0;
		for (int i = 1; i <= 100; i++) {
//			if(i % 16 == 0)
//				str += "\n";
			if(i % 2 == 0) { // even
				if(i == 100) {
					str += i + " = ";
				} else {
					str += i + " + " ;	
				}
				res -= i;
			} else { // odd
				str += i + " - ";
				res += i;
			}
		}
		System.out.println(str + res);
	}
}
