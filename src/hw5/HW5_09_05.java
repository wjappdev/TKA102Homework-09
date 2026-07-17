package hw5;

public class HW5_09_05 {
	private static String genAuthCode() {
		String code = "";
		for (int i = 0; i < 8; i++) {
			int num = getRandomChar();
			code = code + (char) num;
		}
		return code;
	}

	/***
	 * ASCII 對照表:
	 * https://mcusoft.wordpress.com/wp-content/uploads/2015/07/ascii_code_table-1.pdf
	 * 
	 * @return
	 */
	private static int getRandomChar() {
		int num = 0;
		while (true) {
			num = (int) (Math.random() * 122);
			if ((num >= 48 && num <= 57) // 0~9
					|| (num >= 65 && num <= 90) // A ~Z
					|| (num >= 97 && num <= 122)) // a~z
			{
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		String code = genAuthCode();
		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(code);
	}
}
