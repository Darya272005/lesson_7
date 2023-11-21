package jc15_first_ide_app;

public class Main7 {

	public static void main(String[] args) {

		int[] x = { 2, -1, 0, 5, -3, 4, 0, 7 };
		int n = x.length;

		int[] y = new int[n];
		int yIndex = 0;

		
		for (int i = 0; i < n; i++) {
			if (x[i] > 0) {
				y[yIndex] = x[i];
				yIndex++;
			}
		}


		for (int i = 0; i < n; i++) {
			if (x[i] <= 0) {
				y[yIndex] = x[i];
				yIndex++;
			}
		}

	
		for (int i = 0; i < n; i++) {
			System.out.print(y[i] + " ");
		}
	}
}
