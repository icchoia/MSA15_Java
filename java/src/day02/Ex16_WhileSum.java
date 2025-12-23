package day02;

public class Ex16_WhileSum {
	public static void main(String[] args) {
		// 1~100까지 합계
		int a = 1;
		int sum = 0;	// 초기화 시켜야 함
		while ( a <= 100) {
			sum += a++;
			// a++;
		}
		System.out.println("sum of 1~100 : " + sum);
		
	}

}
