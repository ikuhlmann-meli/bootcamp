import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {


    public static void radixSort(int iArr[]){
        String strArr[] = new String[iArr.length];

        for (int i = 0; i < iArr.length; i++){
            strArr[i] = ((Integer) iArr[i]).toString();
        }

        int greatestLength = greatestLength(strArr);

        for (int i = 0; i < iArr.length; i++){
            strArr[i] = leftPad(strArr[i], greatestLength);
            System.out.println(strArr[i]);
        }

        List <List<String>> listas = new ArrayList<List<String>>(10);

        // populando listas
        for (int i = 0; i <= 9; i++){
            listas.add(new ArrayList<String>());
        }

        for (int position = greatestLength - 1; position >= 0; position--){

            for (int i = 0; i <= 9; i++){
                listas.get(i).clear();
            }

            for(String str: strArr){
                int digit = Integer.valueOf(str.substring(position,position + 1));
                listas.get(digit).add(str);
            }

            int cont = 0;
            for (int i = 0; i <=9; i++){

               for (String str: listas.get(i)){
                   //System.out.println(str);
                   strArr[cont] = str;
                   cont ++;
               }
            }
        }

        System.out.println("\n");

        for (int i = 0; i < iArr.length; i++){
            System.out.println(strArr[i]);
        }

    }

    private static int greatestLength(String strArr[]){
        int greatest = 0;
        for (String str: strArr) {
            if (str.length() > greatest) greatest = str.length();
       }
        return greatest;
    }

    public static String leftPad(String stringedNumber, int digits){
        char[] srcCharArray = stringedNumber.toCharArray();
        int diff = digits - srcCharArray.length;
        if(diff == 0) return  stringedNumber;

        char[] newCharArray = new char[digits];

        for (int i = 0; i < digits; i++) {

            if (i < diff) {
                newCharArray[i] = '0';

            } else {
                newCharArray[i] = srcCharArray[i - diff];
            }
        }
        String leftPaddedString = String.valueOf(newCharArray);
        return leftPaddedString;
    }

    public static void main(String [] args){
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i: iArr){
            //System.out.println(i + " ");
        }
    }
}
