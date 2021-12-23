import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RadixSort {


    public static void radixSort(int iArr[]){
        String strArr[] = new String[iArr.length];

        for (int i = 0; i < iArr.length; i++){
            strArr[i] = ((Integer) iArr[i]).toString();
        }

        for (int i = 0; i < iArr.length; i++){
            strArr[i] = leftPad(strArr[i], greatestLength(strArr));

            System.out.println(strArr[i]);
        }

        LinkedList[] L = new LinkedList[10];









//        LinkedList[] list = new LinkedList[6];
//        for (int i = 0; i < 6; i++) {
//            if (list[i] == null) {
//                list[i] = new LinkedList();
//                int temp = i;
//                for (int j = 0; j < temp + 1; j++) {
//                    list[i].add(j);
//                }
//            }
//            System.out.print(list[i]);
//        }








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
