package Operatorprograms;

import java.util.Scanner;

public class Arithmeticoperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter a number ==> ");
        a = s.nextInt();
        System.out.println("Enter second number ==> ");
        b = s.nextInt();
        System.out.println("Enter third number ==> ");
        c = s.nextInt();
        int one, two, three, four;
        one = a+b*c;
        two = c+a/b;
        three =  a%b+c;
        four = a*b+c;
        System.out.println( "a+b*c ==> " + one);
        System.out.println( "c+a/b ==> " + two);
        System.out.println( "a%b+c ==> " + three);
        System.out.println( "a%b+c ==> " + four);

        System.out.println(" ");
        int max = Math.max(Math.max(Math.max(one, two), three), four);
        int min = Math.min(Math.min(Math.min(one, two), three), four);
        System.out.println("Maximum is ==> " + max);
        System.out.println("Minimum is ==> " + min);

    }
}
