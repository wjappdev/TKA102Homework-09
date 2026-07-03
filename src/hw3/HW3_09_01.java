package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class HW3_09_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入三個整數: ");
		GetKyboardInput getKyboardInput = new GetKyboardInput();
		int input1 = getKyboardInput.getInputValue(scanner);
		if (input1 < 0) {
			return;
		}
		int input2 = getKyboardInput.getInputValue(scanner);
		if (input2 < 0) {
			return;
		}
		int input3 = getKyboardInput.getInputValue(scanner);
		if (input3 < 0) {
			return;
		}
		
		if (input1 == input2 && input2 == input3) {
			System.out.println("正三角形");
		} else if ((input1 == input2 && input2 != input3) 
				|| (input1 == input3 && input2 != input3)
				|| (input2 == input3 && input2 != input1)) {
			System.out.println("等腰三角形");
		} else if (input1 == 0 &&  input2 == 0 && input3 == 0) {
			System.out.println("不是三角形");
		} else {
			System.out.println("其他三角形");
		}
		
		System.out.println("進階題");
		int[] inputArray = new int[]{input1, input2, input3};
		Arrays.sort(inputArray);
//		for (int i = 0; i < inputArray.length; i++) {
//			System.out.println(inputArray[i]+"\t");
//		}
		if ((input1 * input1 + input2 * input2) == input3 * input3) {
			System.out.println("是直角三角形");
		} else {
			System.out.println("非直角三角形");
		}
	}
}
