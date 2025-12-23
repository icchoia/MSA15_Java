package day03;

// enum(열거타입) 정의 : 파일로 정의할 수 있고 , 클래스 파일 내부에서 정의할 수도 있음
enum test {A,B,C,D,E,F}

public class Ex07_Enum {
	public static void main(String[] args) {
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		// value()- 열거타입의 모든요소를 배열로 반환,
		// valueOf - 전달된 문자열과 일치하는 열거타입 상수를 반환
		// ordinal() - 해당 열거타입 상수가 정의된 순서(index)를 반환
		Rainbow G = Rainbow.valueOf("PURPLE");  
		System.out.println("G : " + G );
		
		int index = G.ordinal();
		System.out.println("PURPLE의 index : " + index);  // 0 부터 시작함
	}
}
