package com.bit.portal;

import com.bit.opcode.*;

import java.util.Scanner;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bmi bmi = new Bmi();  // bmi 객체 생성
		int pe = 0, i = 0;
		String res = "";
		System.out.print("인원 수 : ");
		pe = scanner.nextInt();
		while(i < pe) {
			res += bmi.main();
			i++;
		}
		System.out.println(res); // 결과 출력
	}
}
