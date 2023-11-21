package jc15_first_ide_app;

public class Main4 {

    public static void main(String[] args) {

        int n = 10;

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = fibS(i);
        }

        printArray("Массив из последовательности Фибоначчи", arr);

    }
//////////////////////////////////////////////////////////////////////////////////
    
    public static int fibS(int num) {
        if ((num == 0) || (num == 1)) {
            return num;
        } else {
            return fibS(num - 1) + fibS(num - 2);
        }
    }
//////////////////////////////////////////////////////////////////////////////////
    
    public static void printArray(String message, int[] masiv) {
        
        for (int i = 0; i < masiv.length; i++) {
            System.out.print("[" + masiv[i] + "]");
        }
    }

}
