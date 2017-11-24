package com.bit.opcode;

import java.util.Scanner;

public class HowMuch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = new String[10];
		str[0] = "얼마에요?\n";
		str[1] = " 원 입니다.\n";
		str[2] = "몇개 드릴까요?\n";
		str[3] = " 개 주세요.\n";
		str[4] = "총 금액은 ";
		str[5] = "원 입니다.\n";
		str[6] = "비싸요, 깎아주세요.\n";
		str[7] = "몇 프로요?\n";
		str[8] = "그럼 %d원 주세요";
		str[9] = "안 남아요, 안 팝니다.";
		int val = 0, num = 0, res = 0, per = 0;
		String result = "";
		System.out.print(str[0]);
		val = scanner.nextInt();
		System.out.print(val + str[1]);
		System.out.print(str[2]);
		num = scanner.nextInt();
		System.out.print(num + str[3]);
		res = val * num;
		System.out.print(str[4] + res + str[5]);
		System.out.print(str[6]);
		System.out.print(str[7]);
		per = scanner.nextInt();
		
		if(per < 10) {
			result = String.format(str[8], (res - (res * per / 100)));
		} else {
			result = str[9];
		}
		System.out.print(result);
	}
}
