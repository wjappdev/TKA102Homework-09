package hw6;

import java.util.Scanner;

import hw3.GetKyboardInput;

public class HW6_09_01 {

	private static class Calculator {

		double powerXY(int x, int y) {
			double result = 0;

			try {
				result = Math.pow(x, y);
				if (x == 0 || y == 0) {
					throw new CalException("0的次方沒有意義!");
				} else if (y < 0) {
					throw new CalException("次方為負值，結果回傳不為整數!");
				} else {
					System.out.println(x+"的"+y+"次方等於"+Math.round(result));
				}
			} catch (CalException e) {
				System.out.println(e.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
		}
	}

	private static class CalException extends Exception {
		public CalException(String string) {
			super(string);
		}
	}

	private static class CalTest {
		public CalTest() {
			super();
			Scanner scanner = new Scanner(System.in);
			GetKyboardInput getKyboardInput = new GetKyboardInput();
			System.out.println("請輸入x的值");
			int x = getKyboardInput.getInputValue(scanner);
			if (x == Integer.MIN_VALUE) return;
			
			System.out.println("請輸入y的值");
			int y = getKyboardInput.getInputValue(scanner);
			if (y == Integer.MIN_VALUE) return;

			Calculator cal = new Calculator();
			cal.powerXY(x, y);
		}
	}

	public static void main(String[] args) {
		new CalTest();
	}
}
