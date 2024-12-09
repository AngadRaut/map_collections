package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
       // Write a program to sort an ArrayList of Strings alphabetically.
        List<String> list = new ArrayList<>();
        list.add("nana");
        list.add("bhanu");
        list.add("mahadev");
        list.add("xebra");
        list.add("zeraf");
        list.add("sugar");
        list.add("hii");
        list.add("hello");
        System.out.println("before sorting list = "+list);
        // sort in natural order
        Collections.sort(list);
        System.out.println("after sorting in natural order list = "+list);
        // sort in reverse order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("after sorting in natural order list = "+list);
    }
}
