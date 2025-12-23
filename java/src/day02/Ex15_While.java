package day02;

public class Ex15_While {
	public static void main(String[] args) {
		// 1~10까지 공백을 두고 출력
		int a = 1;
		
		// 반복문에는 반드시 종료 조건이 성립해야한다. 조료조건이 먼족하지 안쓰면  무한 루프에 빠진다.
		while ( a <= 10) {
			System.out.print(a + " ");
			a += 1 ;// a = a +1;  a++; 같은 의미
		}
		System.out.println();
		System.out.println("a : " + a);
	}
}
