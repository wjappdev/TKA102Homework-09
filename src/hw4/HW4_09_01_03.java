package hw4;

import java.util.LinkedHashMap;
import java.util.Map;

public class HW4_09_01_03 {
	public static void main() {
		question1();
		question2();
		question3();
	}

	private static void question1() {
		System.out.println("===========Question 1==========");
		int[] arr = new int[] { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Avg:" + avg);
		System.out.print("超過平均者:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				System.out.print(" " + arr[i]);
			}
		}
		System.out.println();
	}

	private static void question2() {
		System.out.println("===========Question 2==========");
		String s = "Hello World";
		StringBuilder builder = new StringBuilder(s);
		System.out.println("Inverse String:" + builder.reverse());
		System.out.println();
	}

	private static void question3() {
		System.out.println("===========Question 3==========");
		String[] plant = new String[] { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		Map<Character, Integer> map = new LinkedHashMap();
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);
		for (String item : plant) {
			char[] cArray = item.toLowerCase().toCharArray();
			for (char c : cArray) {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					int count = map.get(c);
					map.put(c, ++count);
				}
			}
		}
		for (Character character : map.keySet()) {
			System.out.println("character: " + character + ", counts:" + map.get(character));
		}
		System.out.println();
	}
}
