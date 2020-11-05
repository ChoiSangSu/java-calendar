package calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getmaxDaysofMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
//		System.out.println("일  월  화  목  금  토");
//		System.out.println("--------------------");
//		System.out.println("1  2  3  4  5  6  7");
//		System.out.println("8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");

		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력

		Scanner scanner = new Scanner(System.in);
		System.out.println("반복 횟수를 선택하세요");
		int repeat = scanner.nextInt();
		for (int i = 0; i < repeat; i++) {
			System.out.println("원하는 달을 입력하세요.");
			Calendar cal = new Calendar();
			int month = scanner.nextInt();
			// 함수를 이용
			cal.getmaxDaysofMonth(month);
			/* int[] arrary = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; */
			// System.out.printf("%d는 %d일까지 있습니다", month, arrary[month - 1]);
			// 함수를 이용하여
			System.out.printf("%d는 %d일까지 있습니다 \n", month, cal.getmaxDaysofMonth(month));
		}
		System.out.println("Good Bye");
		scanner.close();
	}
}
