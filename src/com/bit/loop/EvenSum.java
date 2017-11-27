package com.bit.loop;

public class EvenSum {
	public static void main(String[] args) {
		int sum = 0;
		String str = "";
		for(int i = 1; i <= 100; i++) {
			if(i % 16 == 0) {
				str += "\n";
			}
			if(i % 2 == 0) {
				if(i == 100) {
					str += i + " = ";
				} else {
					str += i + " + ";
				}
				sum += i;
			}
		}
		System.out.println(str + sum);
	}
}