package interviewQuestions5;

import java.util.Scanner;


public class Q02_PrintEvenNumber {
    /*
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    */

    public static void main(String[] args) {

        int sayi=22;
        System.out.println(isEven(sayi));
    }

    private static boolean isEven(int sayi) {
        if (sayi%2==0){
            return true;
        }else
            return false;

    }

}

