package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		//입력 함수를 받아 더하기
		//입력 : 키보드 , 출력 : 화면
		System.out.println("첫번째 숫자: ");
		Scanner scanner = new Scanner(System.in);
		int number1 = scanner.nextInt();
		System.out.println("두번째 숫자:");
		int number2 = scanner.nextInt();
		System.out.println("두수의 합은 : " + (number1+number2));
		System.out.printf("%d와 %d의 합은 %d입니다",number1,number2, number1+number2);
		scanner.close();
	}
}
