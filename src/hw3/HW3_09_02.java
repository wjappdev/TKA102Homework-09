package hw3;

import java.util.Scanner;

public class HW3_09_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("開始猜數字吧! (0~9)");
		GetKyboardInput getKyboardInput = new GetKyboardInput();
		int targetNumber = (int) (Math.random() * 9);
//		System.out.println("targetNumber is: " + targetNumber);
		
		int input = Integer.MIN_VALUE;
		while(true) {
			input = getKyboardInput.getInputValue(scanner);
			if (input == targetNumber) {
				System.out.println("答對了!答案就是:" + targetNumber);
				break;
			}
			System.out.println("猜錯囉");
		};
		
		System.out.println("進階題");
		targetNumber = (int) (Math.random() * 100);
		System.out.println("targetNumber is: " + targetNumber);
		System.out.println("開始猜數字吧! (0~100)");
		input = Integer.MIN_VALUE;
		while(true) {
			input = getKyboardInput.getInputValue(scanner);
			if (input == targetNumber) {
				System.out.println("答對了!答案就是:" + targetNumber);
				break;
			} else {
				if (input > targetNumber) {
					System.out.println("猜錯囉, 再小一點");
				} else {
					System.out.println("猜錯囉, 再大一點");
				}
			}
		};
	}
}
