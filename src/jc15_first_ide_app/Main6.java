package jc15_first_ide_app;

public class Main6 {

    public static void main(String[] args) {

        int[] X = {1, 2, 3, 4, 5};
        int[] Y = {2, 1, 5, 3, 2};

        int sum = 0;
        int count = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] > Y[i] && X[i] > 0) {
                sum += X[i];
                count++;
            }
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Количество элементов: " + count);
    }
}