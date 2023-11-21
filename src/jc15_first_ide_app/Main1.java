package jc15_first_ide_app;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		double[] x = new double[10];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < x.length; i++) {
			System.out.print("array[" + i + "] = ");
			x[i] = sc.nextInt();
		}
		
		vivod(x);
		
		delen(x);

	}
////////////////////////////////////////////////////////////////////
	
	public static void delen(double[] x) {
		double[] y = new double[10];
		
		for (int i = 0; i < y.length; i++) {
			y[i] = x[i] / i;
		}
		
		vivod(y);
		
	}
/////////////////////////////////////////////////////////////////////	
	
	public static void vivod(double[] masiv) {        
        for (int i = 0; i < masiv.length; i++) {
            System.out.println("array[" + i + "] = " + masiv[i]);
        }
        
    }

}