package hw2;

public class HW2_09 {
	public static void main(String[] arg) {
		sumEven();
		sumPlus();
		sumPlus2();
		showSquare();
		filterFour();
		printTenNumbers();
		printText();
	}
	
	private static void sumEven() {
		System.out.println("第一題");
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum:" + sum);
	}
	
	private static void sumPlus() {
		System.out.println("第二題");
		int result = 1;
		for(int i = 1; i <= 10; i++) {
			result = result * i;
		}
		System.out.println("Result:" + result);
	}
	
	private static void sumPlus2() {
		System.out.println("第三題");
		int result = 1;
		int i = 1;
		while(i <= 10) {
			result = result * i;
			i = i + 1;
		}
		System.out.println("Result:" + result);
	}
	
	private static void showSquare() {
		System.out.println("第四題");
		for(int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
	}
	
	private static void filterFour() {
		System.out.println("第五題");
		int tensigits = 0;
		int singleDigits = 0;
		int counts = 0;
		for(int i = 1; i <= 49; i++) {
			tensigits = i /10;
			singleDigits = i % 10;
			if (tensigits == 4 || singleDigits == 4) {
				continue;
			}
			counts++;
			System.out.print(i + " ");
		}
		System.out.println(",Total:" + counts);
	}
	
	private static void printTenNumbers() {
		System.out.println("第六題");
		for (int j = 10 ; j > 0; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	private static void printText() {
		System.out.println("第七題");
		int charNumber = 65; //A
		for (int j = 1; j <= 6; j++) {
			for (int i = 1; i <= j; i++) {
				char c = (char) charNumber;
				System.out.print(c);
			}
			charNumber++;
			System.out.println();
		}
	}
}
