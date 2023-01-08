package Programswithforloop;

import java.util.Scanner;

public class Reverseofanumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ==> ");
        number = sc.nextInt();
        String str = Integer.toString(number);
        int size = str.length();
        System.out.println("Reverse of a number is ==> ");
        int n1, reverse = 0;
        for( int i =0; i < size; i++){
            n1 = number % 10;
            reverse = reverse * 10 + n1;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
