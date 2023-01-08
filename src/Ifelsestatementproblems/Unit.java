package Ifelsestatementproblems;

import java.util.Scanner;

public class Unit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ( 1, 10, 100, 1000) ==> ");
        int digit;
        digit = s.nextInt();
        if ( digit == 1){
            System.out.println("One");}
        else if ( digit == 10){
            System.out.println("Ten");}
        else if ( digit == 100){
            System.out.println("Hundred");}
        else if ( digit == 1000){
            System.out.println("Ten Hundred");}
        else {
            System.out.println("Limit Exceed");}



    }
    }

