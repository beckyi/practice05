package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		int end = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");

		String s = scanner.nextLine();

		/* 구현합니다. */
		while (end <= s.length()) {
			System.out.println((s.toUpperCase()).substring(0, end));
			end++;
		}

		scanner.close();
	}
}
