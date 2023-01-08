package Programswithwhileloop;

import java.util.Scanner;

public class Sumofnaturalnumbers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number==>");
        int number = s.nextInt();
        int sum=0;
        int i = 1;
        while( i <= number){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of N natural Numbers==> " + sum);

    }
}
