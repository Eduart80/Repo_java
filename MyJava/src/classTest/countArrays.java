package classTest;

import java.util.ArrayList;
import java.util.List;

public class countArrays {
    public static void main(String[] args) {
        List<Integer>arr1 =new ArrayList<>();
        arr1.add(1);
        arr1.add(432);
        arr1.add(8765);
        arr1.add(9);

        List<Integer>arr2 =new ArrayList<>();
        arr2.add(9);
        arr2.add(678);
        arr2.add(2345);
        arr2.add(1);

        returnVal(arr1, arr2);
    }
    public static void returnVal(List<Integer> arr1, List<Integer> arr2) {

        List<Integer> arrIn = new ArrayList<>();
        for (int j = 0; j <= arr1.size() - 1; j++) {
            int a = arr1.get(j);
            String number = String.valueOf(arr1.get(j));
            String[] digits = number.split("");

            int zz = 1;
            for(int z = digits.length; z > 0 ; --z){
                if(zz < 10){
                    int doli = a % 10;
                    arrIn.add(doli);
                    zz =zz * 10;
                }else {
                    int doli = a / zz % 10;
                    arrIn.add(doli);
                    zz = zz * 10;
                }
            }
        }

        List<Integer> arrIn2 = new ArrayList<>();
        for (int f = 0; f <= arr2.size() - 1; f++) {

            int b = arr2.get(f);
            String number2 = String.valueOf(arr2.get(f));
            String[] digits2 = number2.split("");

            int zz = 1;
            for(int g = digits2.length; g > 0 ; --g){
                if(zz < 10){
                    int doli = b % 10;
                    arrIn2.add(doli);
                    zz =zz * 10;
                }else {
                    int doli = b / zz % 10;
                    arrIn2.add(doli);
                    zz = zz * 10;
                }
            }
        }

        System.out.println(arrIn);
        System.out.println(arrIn2);
        int count=-1;
        for (int h = 0; h < arrIn.size(); h++) {
            count++;
            if(arrIn.get(h) < arrIn2.get(h)){
                int res = arrIn2.get(h) - arrIn.get(h);
                //System.out.println("Index " + count +" need +"+ res);
                System.out.println("Index " + count +", i added "+ res + " to be equal");
            }else {
                int res = arrIn2.get(h) - arrIn.get(h);
               // System.out.println("Index " + count +" need "+ res);
                System.out.println("Index " + count +", i added "+ res + " to be equal");
            }
        }
    }
}
///////////////////////////////////////////////////////
//            int doli = a % 10;
//            int doli2 = a / 10 % 10;
//            int doli3 = a / 100 % 1000;
