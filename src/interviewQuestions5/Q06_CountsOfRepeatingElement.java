package interviewQuestions5;

import java.util.Scanner;

public class Q06_CountsOfRepeatingElement {
    /*
            How many times a given number is repeated in a sequence
            Create the Java program that finds it.
     */

    public static void main(String[] args) {

        int arr[][] ={{1,2,3,35},{43,2,4,53,1},{4,53,1,8,13}};
        Scanner scan = new Scanner(System.in);
        int sayi=scan.nextInt();
        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==sayi){
                    sayac++;
                }

            }

        }
        System.out.printf("sayi : %5d 'nın adedi : %5d",sayi,sayac);
    }
}