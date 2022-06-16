package interviewQuestions6;


import java.util.Scanner;

public class Q03_OddIndexNumber {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz :");
        String str = scan.nextLine();

        int index = 0;

        do {
            if (index%2==1){
                System.out.print(str.charAt(index)+ " ");  // tek sayıya sahip olan index deki karakterleri yan yana yazdırır
            }
            index++;
        }while (index<str.length()); // index , str nin uzunlugundan kucuk oldugu surece

    }
}
