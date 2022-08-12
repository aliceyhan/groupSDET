package huseyin.java_answers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class answer_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter 10 integer number");
        ArrayList <Integer> numbers=new ArrayList<>();
        ArrayList<Integer> newnumbers=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Integer number=scan.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (!newnumbers.contains(numbers.get(i))){
                newnumbers.add(numbers.get(i));
            }
        }
        System.out.println("new numbers: "+newnumbers);
    }
}
