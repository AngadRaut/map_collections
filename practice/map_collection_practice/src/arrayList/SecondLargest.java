package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SecondLargest {
    public static void main(String[] args) {
        // Write a program to find the second-largest element in an ArrayList of Integers.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(23);
        list.add(37);
        list.add(48);
        list.add(59);
        list.add(61);
        list.add(74);
        list.add(85);
        list.add(91);
        System.out.println("list = "+list);
        // find the second largest element using java 8
        int secondMax = list.stream().sorted().skip(1).findFirst().get();
        System.out.println("second max = "+secondMax);
        int secondMin = list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second min = "+secondMin);
    }
}
