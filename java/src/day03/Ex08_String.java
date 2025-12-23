package day03;

public class Ex08_String {
	// String : 문자열 한들자씩 그 자체를 비교할 대는 equals()를 사용
	public static void main(String[] args) {
		// 문자열 리터럴
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		
		// 문자열 객체생성
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");
		
		System.out.println("a == c " + (a == c));
		System.out.println("a == d " + (a == d));
		System.out.println("문자열 비교 :  " + a.equals(d));
		
		System.out.println("e == f " + (e == f));
		System.out.println("문자열 비교 :  " + e.equals(f));
	}

}
