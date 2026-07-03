package hw3;

import java.util.HashSet;
import java.util.Scanner;

public class HW3_09_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭的數字? (1~9)");
		GetKyboardInput getKyboardInput = new GetKyboardInput();
		int input = getKyboardInput.getInputValue(scanner);
		if (input < 0) {
			return;
		}
		
		while(true) {
			if (input < 1 || input > 9) {
				System.out.println("阿文...請輸入數字需介於 1~9");
				input = getKyboardInput.getInputValue(scanner);
			} else {
				break;
			}
		}
		
		int tensigits = 0;
		int singleDigits = 0;
		int counts = 0;
		int[] validNumbersArray = new int[49];
		for(int i = 1; i <= 49; i++) {
			tensigits = i /10;
			singleDigits = i % 10;
			if (tensigits == input || singleDigits == input) {
				continue;
			} else {
				validNumbersArray[counts] = i;
			}
			System.out.print(i + "\t");
			
			counts++;
			if (counts % 6 == 0) {
				System.out.println();
			}
		}
		System.out.print("Total:" + counts);
		
		System.out.println();
		System.out.println("進階題");
//		for (int i = 0; i < validNumbersArray.length; i++) {
//			System.out.print(validNumbersArray[i] + "\t");
//		}
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(int i = 1; i <= 6; i++) {
			int randomIndex = (int) (Math.random() * counts);
			//Filter redundant index
			while(true) {
				if (hashSet.contains(randomIndex)) {
					randomIndex = (int) (Math.random() * counts);
				} else {
					break;
				}
			}
			hashSet.add(randomIndex);
//			System.out.print(randomIndex + "\t");
			System.out.print(validNumbersArray[randomIndex] + "\t");
		}
	}
}
