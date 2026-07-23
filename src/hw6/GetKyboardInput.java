package hw6;

import java.util.Scanner;

public class GetKyboardInput {
	public int getInputValue(Scanner scanner) {
		int inputValue = 0;
		try {
			inputValue = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("輸入格式不符合規格");
			return Integer.MIN_VALUE;
		}
		return inputValue;
	}
}
