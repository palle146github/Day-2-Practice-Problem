package Programswithforloop;

import java.util.Scanner;

public class Sumofnnaturalnumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number==>");
        int number = s.nextInt();
        int sum=0;
        int i = 1;
        for ( i = 1; i <= number; i++){
            sum = sum + i;
        }
        System.out.println("Sum of N natural Numbers==> " + sum);
    }
}
