package hw5;

public class HW5_09_03 {
	private static class Work03 {	
		void maxElement(int x[][]) {
			int maxValue = 0;
			for(int i=0; i < x.length; i++) {
				for (int j = 0; j< x[0].length; j++) {
					if (x[i][j] > maxValue) {
						maxValue = x[i][j];
					}
				}
			}
			System.out.println("MaxIntValue:" + maxValue);
		}
		
		void maxElement(double x[][]) {
			double maxValue = 0.0;
			for(int i = 0; i < x.length; i++) {
				for (int j = 0; j< x[0].length; j++) {
					if (x[i][j] > maxValue) {
						maxValue = x[i][j];
					}
				}
			}
			System.out.println("MaxIntValue:" + maxValue);
		}
	}

	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		
		double[][] doubleArray = {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		
		Work03 work03 = new Work03();
		work03.maxElement(intArray);
		work03.maxElement(doubleArray);
	}

}
