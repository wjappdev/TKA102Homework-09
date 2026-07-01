package hw1;

public class Hw1_09 {
	public static void main(String[] arg) {
		func1();
		func2();
		func3();
		func4();
		func5();
		func6();
	}
	
	private static void func1() {
		System.out.println("第一題");
		int a = 12;
		int b = 6;
		System.out.println(a + b);
		System.out.println(a * b);
	}
	
	private static void func2() {
		System.out.println("第二題");
		final int EGGS = 200;
		final int DOZEN = 12;
		System.out.println(EGGS / DOZEN + "打" + EGGS % DOZEN + "顆");
	}
	
	private static void func3() {
		System.out.println("第三題");
		final int targetSeconds = 256559;
		int days = targetSeconds / (60*60*24);
		System.out.println("days: " + days);
		int remainSeconds = targetSeconds - 2 * 60 * 60 *24; //remain seconds
		int hours = remainSeconds / (60 * 60);
		System.out.println("hours: " + hours);
		remainSeconds = remainSeconds - hours * 60 * 60;
		int minute = remainSeconds / 60;
		System.out.println("Minute: " + minute);
		remainSeconds = remainSeconds - minute * 60;
		System.out.println("Second: " + remainSeconds);
		
		int totalSeconds = days *(60*60*24) + hours * (60 * 60) + minute * 60 + remainSeconds;
		System.out.println("totalSeconds: " + totalSeconds);
	}
	
	private static void func4() {
		System.out.println("第四題");
		final double PI = 3.1415;
		double radius = 5;
		double area = PI * radius * radius;
		double perimeter = radius * 2 * PI;
		System.out.println("Area: " + area + ", Perimeter: " + perimeter);
	}

	private static void func5() {
		System.out.println("第五題");
		int money = 1500000;
		final float APR = 0.02f; // Annual Percentage Rate
		money = (int) (money * Math.pow((1 + APR), 10));
		System.out.println("十年後共: " + money);
	}
	
	private static void func6() {
		System.out.println("第六題");
		System.out.println("5 + 5: " + (5 + 5)); //兩個5數字相加
		System.out.println("5 + \'5\': " + (5 + '5')); //一個數字5加上一個字元5(53)
		System.out.println("5 + \"5\": " + (5 + "5")); //轉成兩個文字5相加
	}
}
