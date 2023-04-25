import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 4, 8, 2, 6};
        Func func;

        /* Способ 2*/
        func = (int[] array) ->{
            Arrays.sort(array);
            int max = Integer.MIN_VALUE, preMax = Integer.MIN_VALUE;
            for (int i = 0; i < array.length; i++) {
                if (array[i]>max){
                    preMax=max;
                    max = array[i];
                }
            }
            return preMax;
        };
        String str = String.valueOf(func.secondMaxIndex(arr));
        System.out.println(str);

// самый очевидный способ
//        func = (int[] array)->{
//            int max;
//            Arrays.sort(arr);
//            max=array.length-1;
//            return max;
//        };
//    String str = String.valueOf(func.secondMaxIndex(arr));
//        System.out.println(str);


    }


}
