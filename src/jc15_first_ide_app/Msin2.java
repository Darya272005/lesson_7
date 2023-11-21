package jc15_first_ide_app;


public class Msin2 {

	public static void main(String[] args) {

		double[] c = { 1.5, 2.5, 3.5 };
		
		double[] b = { 4.2, 5.2, 6.2 }; 

		double distance = cal(c, b);
		
		System.out.println("Расстояние между точками: " + distance);
	}
	////////////////////////////////////////////////////////////////

	public static double cal(double[] c, double[] b) {
		int dimension = c.length; 
		double sum = 0;

		for (int i = 0; i < dimension; i++) {
			double diff = c[i] - b[i];
			sum += diff * diff;
		}

		return Math.sqrt(sum);
	}
}
