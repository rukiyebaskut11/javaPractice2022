package interviewQuestions1;

import java.util.Scanner;

public class Tekrar {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        String pinKodu = "rukiye.1234";
        int girisHakki =3;

        System.out.println("<<<<<HOSGELDINIZ>>>>");


        while(true){
            System.out.println("Lutfen pin kodunuzu giriniz : ");
            String girilenPinKodu = scan.nextLine();


            if (pinKodu.equals(girilenPinKodu)){
                System.out.println("basarılı giris yaptiniz..");
                break;
            }else
                System.out.println("yanlis giris yaptiniz..");
                girisHakki--;

                System.out.println(" kalan hakkınız: "+girisHakki );

                if (girisHakki==0){
                    System.out.println("giris hakkınız kalmadı...\nkartınız bloke oldu");
                    break;
                }


        }

    }
}
