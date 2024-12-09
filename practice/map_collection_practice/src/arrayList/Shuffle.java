package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        // Write a program to shuffle the elements of an ArrayList.
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
        System.out.println("list before shuffle = "+list2);
        Collections.shuffle(list2);
        System.out.println("list after shuffle = "+list2);
    }
}
