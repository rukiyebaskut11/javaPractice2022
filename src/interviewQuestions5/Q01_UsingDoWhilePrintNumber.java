package interviewQuestions5;

import java.util.Scanner;

public class Q01_UsingDoWhilePrintNumber {
    /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz :");
        int sayi=scan.nextInt();

        do {
            System.out.print(sayi+" ");
            sayi+=5;
        }while (sayi<100);



    }

}
