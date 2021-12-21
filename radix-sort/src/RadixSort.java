import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public static void radixSort(int iArr[]){
        String strArr[] = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++){
            //Integer nn = (Integer)i;

            strArr[i] = ((Integer) iArr[i]).toString();
            System.out.println(greatestLength(strArr));
            String newStringArr = leftPad(strArr[i], 8);
            System.out.println(newStringArr);
        }
    }

    private static int greatestLength(String[] strArr){
        int greatestLength = 0;
        for (String str: strArr) {
            if (str.length() > greatestLength) greatestLength = str.length();
        }
        return greatestLength;
    }

    public static String leftPad(String stringedNumber, int digits){
        char[] srcCharArray = stringedNumber.toCharArray();
        int diff = digits - srcCharArray.length;
        if(diff == 0) return  stringedNumber;

        char[] newCharArray = new char[digits];

        for (int i = 0; i < digits; i++) {
            newCharArray[i] = '0';

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
