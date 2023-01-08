package Operatorprograms;

import java.util.Scanner;

public class Euclideandistance {
    public static void main(String[] args) {
        double x, y, distance;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate ==> ");
        x = s.nextInt();
        System.out.println("Enter the y co-ordinate ==> ");
        y = s.nextInt();
        distance = Math.sqrt( Math.pow( x, 2 ) + Math.pow( y, 2 ));
        System.out.println("Euclidean distance is ==> " + distance );
    }
}
