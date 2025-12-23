package day03;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		// 첫번째 줄에 입력할 갯수 N을 입력받고, 둘째줄에 N개의 정수를 공백을 두고 입력반고
		// N개의 정수 중, 최 대값을 구하시오
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[]= new int[N];
		int max = Integer.MIN_VALUE; // -21억 - int형의 최소값

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i] ) {
				max = arr[i];
			} 
		}
		System.out.println("최대값 : " + max);
		sc.close();
	}

}
