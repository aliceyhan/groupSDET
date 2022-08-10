package huseyin;

import java.util.Arrays;

public class exercise_1 {
    public static void main(String[] args) {
        int [] number={1,2,4,5,7,9,-2,3};
        int [] num=new int[number.length];
        int f=0;
        int l=number.length-1;
        for (int i = 0; i < number.length ; i++) {
            if (number[i]%2!=0){
                num[f]=number[i];
                f++;
            }else {
                num[l]=number[i];
                l--;
            }

        }
        System.out.println("new array is: "+ Arrays.toString(num));
    }
}
