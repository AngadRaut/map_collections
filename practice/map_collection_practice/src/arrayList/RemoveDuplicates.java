package arrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Write a program to remove all duplicate elements from an ArrayList.
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
        list.add(23);
        list.add(37);
        list.add(48);
        list.add(59);
        list.add(61);
        System.out.println("_________________________________________________________________________________________");
        System.out.println("original list = "+list);
        Set<Integer> integerSet = new HashSet<>(list);
        System.out.println("after removing duplicates by passing it into set ,list becomes = "+integerSet);
        // using java-8
        System.out.println("_________________________________________________________________________________________");
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println("using java-8 , after removing duplicates list = "+list1);
        System.out.println("_________________________________________________________________________________________");

    }
}
