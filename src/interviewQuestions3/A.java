package interviewQuestions3;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz : ");
        String input = scan.next();

        StringBuilder output = new StringBuilder();
        output.append(input);

        String reverseInput = output.reverse().toString();
        System.out.println(reverseInput);
    }
}
