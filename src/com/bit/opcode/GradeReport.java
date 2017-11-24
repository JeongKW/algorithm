package com.bit.opcode;

import java.util.Scanner;

/*
[문제] 국어, 영어, 수학 3과목의 점수를
입력받아서 평균에 따라 학점을 정하시오.

condition)
90 <= avg <= 100 -> A
80 <= avg < 90 -> B
70 <= avg < 80 -> C
60 <= avg < 70 -> D
50 <= avg < 60 -> E
avg < 50 -> F  
*/

public class GradeReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sKor = 0, sEng = 0, sMath = 0, avg = 0;
		String name = "";
		String grade = "";
		System.out.print("이름 입력\n");
		name = scanner.next();
		System.out.print("국어 점수 입력\n");
		sKor = scanner.nextInt();
		System.out.print("영어 점수 입력\n");
		sEng = scanner.nextInt();
		System.out.print("수학 점수 입력\n");
		sMath = scanner.nextInt();
		avg = (sKor + sEng + sMath) / 3;
/*
		if(avg >= 90 && avg < 100){
			grade = "A";
		} else if(avg >= 80 && avg < 90){
			grade = "B";
		} else if(avg >= 70 && avg < 80){
			grade = "C";
		} else if(avg >= 60 && avg < 70){
			grade = "D";
		} else if(avg >= 50 && avg < 60){
			grade = "E";
		} else {
			grade = "F";
		}
*/
		switch(avg / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.printf("%s [평균] %d [학점] %s", name, avg, grade);
	}
}
