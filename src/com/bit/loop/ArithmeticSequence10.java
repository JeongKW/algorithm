package com.bit.loop;
/*
 * Algorithm 10번
 * 1 + 2 + 3 + 4 + ... + 100
 */
public class ArithmeticSequence10 {
	public static void main(String[] args) {
		String str = "";
		int sum = 0;
		for (int i = 1 ; i <= 100 ; i++) {
			if(i % 16 == 0) {
				str += "\n";
			}
			if(i == 100) {
				str += i + " = ";
			} else {
				str += i + " + ";
			}
			sum += i;
		}
		System.out.print(str + sum);
//		int sum = 0;
//		String str = "";
//		for (int i = 1; i <= 10; i++) {
//			if(i == 10) {
//				str += i + " = ";
//			} else {
//				str += i + " + ";
//			}
//			sum += i;
//		}
//		System.out.println(str + sum);
	}
}
