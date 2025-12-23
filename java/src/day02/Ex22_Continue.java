package day02;

import java.util.Scanner;

public class Ex22_Continue {
	public static void main(String[] args) {
		
		// 5개의 정수를 입력받아 정수중 양수마 합계를 구하여 출력
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 5; i++) {
			int n = sc.nextInt();
			if ( n < 0 ) continue;
			sum += n;
		}
		System.out.println("양수의 합 : " + sum);
		sc.close();
	}
}
