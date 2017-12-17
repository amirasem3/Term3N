package Q1;

import java.util.Scanner;

/**
 * AHAY
 * ASAY
 * Created by AmirHosein on 12/16/2017.
 */
public class Matrix {
    public static void main(String[] args) {
        int m  , n ;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[]numbers = new int[n*n];
        for (int i = 0 ; i<numbers.length ; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println(numbers[m-1]);

    }
}
