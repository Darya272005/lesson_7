package jc15_first_ide_app;

import java.util.Arrays;
import java.util.Random;

public class Main5 {

	public static void main(String[] args) {

		int n = 8;

		double[] a = generateRandomArray(n);
		double[] b = generateRandomArray(n);

		printArray("Введите массив A:", a);
		printArray("Введите массив B:", b);

		double[] t = calculateT(a, b);
		printArray("Введите массив T:", t);
	}

////////////////////////////////////////////////////////////////////////

	public static double[] generateRandomArray(int n) {

		double[] array = new double[n];

		Random random = new Random();

		for (int i = 0; i < n; i++) {
			array[i] = random.nextDouble();
		}
		return array;
	}

/////////////////////////////////////////////////////////////////////////

	public static void printArray(String message, double[] array) {
		System.out.println(message + " " + Arrays.toString(array));
	}

/////////////////////////////////////////////////////////////////////////

	public static double[] calculateT(double[] a, double[] b) {
		double[] t = new double[a.length];
		for (int i = 0; i < t.length; i++) {
			if (i < 2) {
				t[i] = a[i] / b[i];
			} else {
				t[i] = Math.pow(a[i] / b[i], 1.0 / i);
			}
		}
		return t;
	}
}
