package interviewQuestions6;


import java.util.ArrayList;
import java.util.Arrays;

public class Q06_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {

        String str = "Javaisalsoeasy";
        char [] arr= str.toCharArray();   // her bir karakteri bir array e donudturur
        System.out.print("Arrays.toString(arr) = "+ Arrays.toString(arr));
        // Arrays.toString(arr) = [J, a, v, a, i, s, a, l, s, o, e, a, s, y]


        ArrayList<Character> output = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {  // arr deki her bir elemana bakar
            for (int j = 0; j < arr.length; j++) {  // her bir elemana bakarken bir sonraki ile karsilastirir

                if (arr[i] == arr[j] && !output.contains(arr[j])){
                    System.out.print(arr[j]); // o elemani yazdir
                    output.add(arr[j]);

                }

            }

        }
        System.out.println("output = "+ output); // [a, s ]
    }

}

