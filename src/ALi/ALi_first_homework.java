package ALi;

import java.util.Arrays;

public class ALi_first_homework {
    public static void main(String[] args) {
            int [] number={1,2,4,5,7,9,-2,3};

            int[] sortedNumber= new int[number.length];

            int temp = number.length-1;
            int index = 0;
            for (int each:number) {
                if (each % 2 == 0){
                    sortedNumber[temp]= each;
                    temp--;
                }
                if (each % 2 != 0) {
                    sortedNumber[index]=each;
                    index++;
                }
            }
            System.out.println(Arrays.toString(sortedNumber));

    }
}
