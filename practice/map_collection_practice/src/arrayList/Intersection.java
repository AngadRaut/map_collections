package arrayList;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
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
        System.out.println("list-1 = " + list);
        // list 2
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
        System.out.println("list2 = " + list2);
        // intersection of two list is =
        ArrayList<Integer> intersectionList = new ArrayList<>(list);
        intersectionList.addAll(list2);
//        System.out.println("intersection of two list = "+intersectionList);
        // find the intersection
        Set<Integer> integerSet = new TreeSet<>();
        for (Integer i : intersectionList) {
            if (integerSet.add(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
