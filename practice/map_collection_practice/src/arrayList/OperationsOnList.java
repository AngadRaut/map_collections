package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationsOnList {
    public static void main(String[] args) {
        // Create a LinkedList and perform various operations like add, remove, and iterate over it.
        List<Integer> list = new ArrayList<>();
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
        System.out.println("original list = "+list);
        list.removeIf(a -> a%2==0);
        System.out.println("after removing even element list = "+list);
        // iterate the elements of arrayList
        for(Integer i : list){
            System.out.println(i+" ");
        }
    }
}
