package interviewQuestions6;

public class Q01_FrequencyOfGivenCharacters {
	/*
   Interview sorusu...
   Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

   Test data:
   Input = AAABBCDD
   output = A3B2C1D2
           */
    public static void main(String[] args) {

        String str= "AAABBCDD";
        frekans(str);



    }

    private static void frekans(String str) {


        String output="";

        for (int i = 0; i < str.length(); i++) {  // i---> kıyas edilen harfimiz

            int sayac=0;
            for (int j = 0; j < str.length(); j++) {  // j---> kıyas eden harf,onun için i den baslamak gerek
                                                        // j=i desek de aynı sonuc olur
                if (str.substring(i,i+1).equals(str.substring(j,j+1))){
                    sayac++;
                }

            }if (!output.contains(str.substring(i,i+1))){  // eger kıyas edilen harf output da yoksa
                output+=str.substring(i,i+1) + sayac;

            }//else sayac=0;  // tekrar edilen diğer harfler için sayacı sıfırlıyoruz

        }
        System.out.println("output :"+output);  // output :A3B2C1D2

    }


}
