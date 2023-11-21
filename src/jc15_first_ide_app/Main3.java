package jc15_first_ide_app;

import java.util.Random;

public class Main3 {
	public static void main(String[] args) {

		int n = 8;

		double[] x = new double[n];
		double[] z = new double[n];

		initArrayWithRandom(x);
		initArrayWithRandom(z);

		printArray("Введите массив X:", x);
		
		printArray("Введите массив Z:", z);

		System.out.println();

		createYArray(x, z);

	}
/////////////////////////////////////////////////////////////////////////
	public static void initArrayWithRandom(double[] masiv) {
		Random rand = new Random();

		for (int i = 0; i < masiv.length; i++) {
			masiv[i] = rand.nextDouble() * 100;
		}
	}
/////////////////////////////////////////////////////////////////////////
	public static void printArray(String message, double[] masiv) {


		for (int i = 0; i < masiv.length; i++) {
			System.out.printf("[%.2f]", masiv[i]);
		}

		System.out.println();
	}
//////////////////////////////////////////////////////////////////////////
	public static void createYArray(double[] x, double[] z) {
		double[] y = new double[x.length];

		Random rand1 = new Random();

		double a = rand1.nextDouble() * 100;
		double b = rand1.nextDouble() * 100;
		double c = rand1.nextDouble() * 100;
		double d = rand1.nextDouble() * 100;

		for (int i = 0; i < x.length; i++) {
			y[i] = (a * x[i] + b) / (c * z[i] + d);
		}

		printArray("Введите массив Y:", y);
	}

}