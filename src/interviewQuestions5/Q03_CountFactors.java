package interviewQuestions5;

import java.util.Scanner;

public class Q03_CountFactors {
    /*
      Type java code by using while loop,
     Write a program to count the factors of an integer which is entered by user.
     Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
     Factors of 8  = 1, 2, 4, 8 ==> 4
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen bir tamsayi giriniz :");
        int sayi=scanner.nextInt();
        int sayac = 1;
        int i=1;

        System.out.print("Factors of "+ sayi+ " = ");
        while (i<sayi) {
          if (sayi%i==0){
              System.out.print(i+", ");
              sayac++;
          }
          i++;

        }
        System.out.print(sayi+ " ==> "+sayac);






    }
}
