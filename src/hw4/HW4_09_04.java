package hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hw3.GetKyboardInput;

public class HW4_09_04 {
	public static void main() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入欲借的金額: ");
		GetKyboardInput getKyboardInput = new GetKyboardInput();
		int input = getKyboardInput.getInputValue(scanner);

		int[] employeesIdArray = new int[] { 25, 32, 8, 19, 27 };
		int[] moneyArray = new int[] { 2500, 800, 500, 1000, 1200 };

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < moneyArray.length; i++) {
			if (input <= moneyArray[i]) {
				list.add(employeesIdArray[i]);
			}
		}
		System.out.println(list.toString());
	}
}
