package hw5;

import java.util.ArrayList;
import java.util.List;

public class HW5_09_02 {

	public static void main(String[] args) {
		randAvg();
	}
	
	private static void randAvg() {
		System.out.println("本次亂數結果:");
		List<Integer> list = new ArrayList<>();
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int randomNumber = (int) (Math.round(Math.random() * 100));
			list.add(randomNumber);
			System.out.print(randomNumber + " ");
			sum = sum + randomNumber;
		}
		System.out.println();
		System.out.println("平均值:" + (sum/10));
		
	}

}
