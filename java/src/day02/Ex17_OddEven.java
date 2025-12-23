package day02;

public class Ex17_OddEven {
	public static void main(String[] args) {
		// 1~20까지의 정수중, 홀수의 합계, 짝수의 합계 를 구하여 출력
		int i = 1;
		int sum1 = 0, sum2 = 0;
		while ( i <= 20 ) {
			// 홀수
			if ( i % 2 == 1) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
			i++;
		}
		System.out.println("홀수의 합계 : " + sum1);
		System.out.println("짝수의 합계 : " + sum2);
	}

}
