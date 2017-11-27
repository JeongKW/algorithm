package com.bit.opcode;

import java.util.Scanner;
import java.math.*;

/* BMI
 * BMI = 몸무게 / 키의 제곱(m2)
 * 저체중 : <18.5, 정상체중 : 18.5~22.9,
 * 과체중 : 23.0~24.9
 * 비만 경도 : 25.0~29.9, 중등도 : 30~34.9, 고도 >=35.0
 */

public class Bmi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String res = "";
		int pe = 0;
		System.out.print("몇 명의 입력을 받을까요? ");
		pe = scanner.nextInt();
		for(int i = 0; i < pe; i++) {
			//variable init 해줘라.
			String name = "", bm = "";
			double hei = 0.0, wei = 0.0, bmi = 0.0;
			System.out.print("이름 입력 : ");
			name = scanner.next();
			System.out.print("키 입력(cm) : ");
			hei = scanner.nextDouble();
			System.out.print("몸무게 입력 : ");
			wei = scanner.nextDouble();
			hei = hei / 100.0;
			bmi = wei / (hei * hei);
			if(bmi < 18.5) {
				bm = "저체중";
			} else if (bmi >= 18.5 && bmi < 23) {
				bm = "정상";
			} else if(bmi >= 23 && bmi < 25) {
				bm = "과체중";
			} else if(bmi >= 25 && bmi < 30) {
				bm = "경도 비만";
			} else if(bmi >= 30 && bmi < 35) {
				bm = "중등도 비만";
			} else if(bmi >= 35) {
				bm = "고도 비만";
			}
			res += String.format("%s 님의 bmi지수는 %.2f이고 %s입니다.\n",
					name, bmi, bm);
		}
			System.out.print(res);
	}
}
