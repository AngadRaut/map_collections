package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class MaxAndMinFromArrayList {
    public static void main(String[] args) {
        // Write a program to find the maximum element from an ArrayList of Integers.
        // Create an ArrayList of integers
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
        System.out.println("_____________________________________________________________________________________________");

        // Print the list
        System.out.println("original ArrayList of integers: " + list);
        // find the max using collection methods without java-8
        int max1 = Collections.max(list);
        System.out.println(max1);
        System.out.println("max = "+max1);
        // min
        int min1 = Collections.min(list);
        System.out.println("min = "+min1);

        System.out.println("_____________________________________________________________________________________________");
        System.out.println("using java-8\noriginal ArrayList of integers: " + list);
        // find the max from list using java-8
        int max = list.stream().max((a,b)->a-b).get();
        System.out.println("max = "+max);
        // min from list
        int min = list.stream().min((a,b)->a-b).get();
        System.out.println("min = "+min);
        System.out.println("_____________________________________________________________________________________________");

    }
}
