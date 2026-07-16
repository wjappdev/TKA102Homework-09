package hw4;

public class HW4_09_06 {
	public static void main() {
		int timesOfTest = 0;
		int students = 0;
		int[][] scoreArray = new int[][] { { 10, 35, 40, 100, 90, 85, 75, 70 }, // 1考
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, // 2考
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 }, };

		timesOfTest = scoreArray.length;
		students = scoreArray[0].length;
		int[] statisticsArray = new int[students];

		for (int i = 0; i < timesOfTest; i++) {
			int maxScoreIndex = getMaxScoreStudent(scoreArray, i);
			statisticsArray[maxScoreIndex]++;
		}

		for (int i = 0; i < students; i++) {
			System.out.println((i + 1) + "號, 次數:" + statisticsArray[i]);
		}
	}

	private static int getMaxScoreStudent(int[][] scoreArray, int examIndex) {
		int students = scoreArray[0].length;
		int maxScore = 0;
		int maxScoreIndex = 0;
		for (int i = 0; i < students; i++) {
			if (scoreArray[examIndex][i] > maxScore) {
				maxScore = scoreArray[examIndex][i];
				maxScoreIndex = i;
			}
		}
//		System.out.println("maxScoreIndex:" + maxScoreIndex);
		return maxScoreIndex;
	}
}
