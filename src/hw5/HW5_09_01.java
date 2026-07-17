package hw5;

import java.util.Scanner;

import hw3.GetKyboardInput;

public class HW5_09_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("輸入寬與高: ");
		GetKyboardInput getKyboardInput = new GetKyboardInput();
		int width = getKyboardInput.getInputValue(scanner);
		if (width < 0) {
			return;
		}
		int height = getKyboardInput.getInputValue(scanner);
		if (height < 0) {
			return;
		}
		for (int i = 0 ; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
