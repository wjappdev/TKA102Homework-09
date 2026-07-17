package hw5;

import java.util.Scanner;

public class GetKyboardInput {
	public int getInputValue(Scanner scanner) {
		int inputValue = 0;
		if (scanner.hasNextInt()) {
			inputValue = scanner.nextInt();
		} else {
			System.out.println("輸入數字不符合規格");
			return -1;
		}	
		return inputValue;
	}
}
