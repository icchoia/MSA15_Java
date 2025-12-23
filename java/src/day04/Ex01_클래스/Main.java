package day04.Ex01_클래스;

public class Main {
	public static void main(String[] args) {
		// 객체 생성
		Person person = new Person();
		person.name = "김조은";
		person.age = 20;
		
		System.out.println("이름 : " + person.name);
		System.out.println("나이 : " + person.age);
		
		// 메소드 호출
		person.eat("마라탕");
		person.work("노가다", 16);
	}
}
