package com.bit.loop;

public class OddSum {
	public static void main(String[] args) {
		int oddSum = 0, evenSum = 0;
		String oddStr = "", evenStr = "";
		for(int i = 1; i <= 100; i++) {
			if(i % 16 == 0) { // newline
				oddStr += "\n";
				evenStr += "\n";
			}
			if(i % 2 == 1) { // Odd
				if(i == 99) {
					oddStr += i + " = ";
				} else {
					oddStr += i + " + ";					
				}
				oddSum += i;
			} else { // Even
				if(i == 100) {
					evenStr += i + " = ";
				} else {
					evenStr += i + " + ";
				}
				evenSum += i;
			}
		}
		System.out.println(oddStr + oddSum);
		System.out.println(evenStr + evenSum);
	}
}
