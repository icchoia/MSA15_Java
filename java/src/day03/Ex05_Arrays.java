package day03;

public class Ex05_Arrays {
	public static void main(String[] args) {
		// 2차원 배열 선언  - 2행 3열 배열 생성
		int arr[][] = new int[2][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		for (int i = 0; i < arr.length; i++) {			// 첫번째 차원의 배열의 갯수length  2
			for (int j = 0; j < arr[i].length; j++) {	// 두번째 차원의 배열의 갯수length  3
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}