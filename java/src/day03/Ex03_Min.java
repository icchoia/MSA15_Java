package day03;

import java.util.Scanner;

public class Ex03_Min {
	public static void main(String[] args) {
		// 첫번째 줄에 입력할 갯수 N을 입력받고, 둘째줄에 N개의 정수를 공백을 두고 입력반고
		// N개의 정수 중, 최소값을 구하시오
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[]= new int[N];
		int min = Integer.MAX_VALUE; // 22억 - int형의 최대값

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if ( min > arr[i] ) {
				min = arr[i];
			}
		}
		System.out.println("최소값 : " + min);
		sc.close();
	}

}
