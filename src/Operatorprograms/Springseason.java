package Operatorprograms;

import java.util.Scanner;

public class Springseason {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m, d;
        System.out.println("Enter m value ==> ");
        m = s.nextInt();
        System.out.println("Enter d value ==> ");
        d = s.nextInt();
        boolean result = false;
        switch ( m ){
            case 3:
                if ( d <= 31 && d >= 20) {
                    result = true;
                }
                break;
            case 4:
                if ( d <= 30 ){
                    result = true;
                }
                break;
            case 5:
                if ( d <= 31 ){
                    result = true;
                }
                break;
            case 6:
                if ( d <= 20 ){
                    result = true;
                }
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
        System.out.println(result);
    }
}
