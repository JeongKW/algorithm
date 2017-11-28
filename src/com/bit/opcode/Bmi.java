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
	public String main() { // void에서 String 값으로 하여 Portal에서
						   // String res 값에 누적 assignment 하기 위해 수정
		String res = "";
		Scanner scanner = new Scanner(System.in);
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
		return res += String.format("%s 님의 bmi지수는 %.2f이고 %s입니다.\n",
				name, bmi, bm); // return String 값
		}
}
