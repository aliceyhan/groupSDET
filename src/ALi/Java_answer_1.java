package ALi;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_answer_1 {
    public static void main(String[] args) {
        // 1-8-9-2-6-6-1-3-5-5
        ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,8,9,2,6,6,1,3,5,5));
        ArrayList<Integer>soretedNumbers=new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if (!soretedNumbers.contains(numbers.get(i))){
                soretedNumbers.add(numbers.get(i));
            }
        }


        System.out.println(soretedNumbers);
    }
}

