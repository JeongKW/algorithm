package com.bit.portal;

import java.util.Scanner;

import com.bit.loop.InputSum;
import com.bit.opcode.Bmi;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bmi bmi = new Bmi(); // bmi 객체 생성
		InputSum ins = new InputSum();
		int pe = 0, i = 0, sel=0;
		String res = "";
		System.out.print("종료(0), bmi(1), InputSum(2) : ");
		sel = scanner.nextInt();
		if(sel == 0) {
			return;
		} else if(sel == 1) {
			System.out.print("인원 수 : ");
			pe = scanner.nextInt();
			while(i < pe) {
				res += bmi.main();
				i++;
			}
			System.out.println(res); // 결과 출력
		} else {
			System.out.println(ins.main());
		}
		
	}
}
