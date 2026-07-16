package hw4;

import java.time.Year;
import java.util.Scanner;

import hw3.GetKyboardInput;

public class HW4_09_05 {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入年月日: ");
		GetKyboardInput getKyboardInput = new GetKyboardInput();
		int year = getKyboardInput.getInputValue(scanner);
		if (year < 0) {
			return;
		}
		int month = getKyboardInput.getInputValue(scanner);
		if (month < 0) {
			return;
		}
		int day = getKyboardInput.getInputValue(scanner);
		if (day < 0) {
			return;
		}

		boolean isLeap = Year.isLeap(year); // 自動根據格里高利曆規則判斷
//		System.out.println(day);
		if (checkInputValue(isLeap, month, day) == false)
			return;

		int[] monthOfDays = new int[] { 31, (isLeap) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int durationDays = 0;
		if (month > 0) {
			for (int i = 0; i < month - 1; i++) {
				durationDays += monthOfDays[i];
			}
		}

		durationDays += day;
		System.out.println("輸入的日期為該年的:" + durationDays);
	}

	private static boolean checkInputValue(Boolean isLeap, int month, int day) {
		if (isLeap) {
			if (month == 2 && day > 29) {
				System.out.println("今年是閏年，二月應該為29天");
				return false;
			}
		} else if (month == 2 && day > 28) {
			System.out.println("二月應該為28天");
			return false;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day > 31) {
				System.out.println(month + "月應該為31天");
				return false;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day > 30) {
				System.out.println(month + "月應該為30天");
				return false;
			}
		} else if (month < 1 || month > 12) {
			System.out.println(month + "月份輸入錯誤");
			return false;
		}

		return true;
	}
}
