package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("\nbefore sorting list = "+list);
        // sort in natural order
        Collections.sort(list);
        System.out.println("after sorting in natural order list = "+list);
        // sort in reverse order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("after sorting in natural order list = "+list);

        // custom sort the list by inc length
        Collections.sort(list,(a,b)->(a.length()-b.length()));
        System.out.println("list in inc length order = "+list);
        // custom sort the list by dec length
        Collections.sort(list,(a,b)->(b.length()-a.length()));
        System.out.println("list in dec length order = "+list);

        System.out.println("_________________________________________________________________________________________");
        System.out.println("using java 8 list sorting");
        // using java 8
        List<String> list1 = new ArrayList<>();
        list1.add("abcd");
        list1.add("bhanuwer");
        list1.add("mahadeve");
        list1.add("xebra");
        list1.add("zerafwrtiohf");
        list1.add("sugarssssss");
        list1.add("jyotisss");
        list1.add("jag");
        // original list
        System.out.println("original list is = "+list1);
        // sort in natural order
        List<String> list2 = list1.stream()
                .sorted().toList();
        System.out.println("sorting in natural order using java 8 list = "+list2);
        // sort in reverse natural order
        List<String> list3 = list1.stream()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println("sorting in reverse natural order using java 8 list = "+list3);
        // custom sorting by increasing length
        List<String> sortByIncLength = list1.stream()
                .sorted((a,b)->a.length()-b.length()).toList();
        System.out.println("sorting in increasing length using java 8 list = "+sortByIncLength);
        // custom sort list by decreasing length
        List<String> sortByDecLength = list1.stream()
                .sorted((a,b)->-(a.length()-b.length())).toList();
        System.out.println("sorting in decreasing length using java 8 list = "+sortByDecLength);
    }
}
