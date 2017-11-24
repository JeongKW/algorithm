package com.bit.opcode;

import java.util.Scanner;

public class WhoAreYou {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = "";
		System.out.print("당신의 이름은?");
		name = s.next();
		System.out.print("당신의 이름은 " + name + "입니다.");
		s.close();
	}
}