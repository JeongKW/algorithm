package com.bit.loop;

import java.util.Scanner;

public class InfiniteDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		while(true) {
			System.out.println("[메뉴] 0.정지");
			input = scanner.nextLine();
			switch(input) {
			case "0":
				System.out.println("종료\n");
				return;
			default:
				System.out.println("infinite loop\n");
				break;
			}
		}
	}
}
