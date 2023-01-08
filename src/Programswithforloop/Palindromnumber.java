package Programswithforloop;

import java.util.Scanner;

public class Palindromnumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ==> ");
        number = sc.nextInt();
        String str = Integer.toString(number);
        int size = str.length();
        int n1, reverse = 0;
        int duplicate = number;
        for (int i = 0; i < size; i++) {
            n1 = number % 10;
            reverse = reverse * 10 + n1;
            number = number / 10;
        }
        if ( duplicate == reverse ){
            System.out.println( duplicate + " is a Palindrom number ");
        }
        else{
            System.out.println( duplicate + " is not a Palindrom number ");
        }
    }
}
