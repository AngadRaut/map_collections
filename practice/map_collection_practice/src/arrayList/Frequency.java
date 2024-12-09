package arrayList;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Frequency {
    public static void main(String[] args) {
        // Write a program to find the frequency of each element in an ArrayList.
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(12);
        list2.add(3);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(1);
        list2.add(7);
        list2.add(5);
        list2.add(9);
        System.out.println(list2);
        // using java 8
        Map<Integer,Long> map = list2.stream()
                .collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(map);
    }
}
