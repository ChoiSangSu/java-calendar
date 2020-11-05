package calendar;

import java.util.Scanner;

public class ViewCalendar {
	private final static String PROMPT = "cal> ";

	public void printSamlpeCalendar(int year, int month) {
		System.out.printf("       <<%4d년 %3d월>> \n", year, month);
		System.out.println("  SU MO TU WE TH FR SA");
		System.out.println("-----------------------------------");
		Calendar cal = new Calendar();
		int maxDay = cal.getmaxDaysofMonth(year,month);
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%4d", i);
			if (i % 7 == 0 ) {
				System.out.println();
			}
		}
//		System.out.println("  1    2    3    4    5    6    7");
//		System.out.println("  8    9  10  11  12  13  14");
//		System.out.println("15  16  17  18  19  20  21");
//		System.out.println("22  23  24  25  26  27  28");
	}

	public void runPrompt() {

		Scanner scanner = new Scanner(System.in);
		// for문을 이욯
		// 반복 횟수 정하기
//		System.out.println("반복 횟수는? ");
//		int repeat = scanner.nextInt();
//		for (int i = 0; i < repeat; i++) {
//			System.out.println("월을 입력 하세요");
//			System.out.print(PROMPT);
//			int month = scanner.nextInt();
//			if (month == 3) {
//				ViewCalendar view = new ViewCalendar();
//				view.printSamlpeCalendar(month);
//			} else if (month == -1) {
//				System.out.println("GOOD BYE");
//			}
//		}
//		scanner.close();

		while (true) {
			System.out.println();
			System.out.println("월을 입력 하세요");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			if (month == -1) {
				System.out.println("GOOD BYE");
				break;
			}
				ViewCalendar view = new ViewCalendar();
				view.printSamlpeCalendar(2017, month);
		}
	}

	public static void main(String[] args) {
		ViewCalendar v = new ViewCalendar();
		v.runPrompt();
	}
}
