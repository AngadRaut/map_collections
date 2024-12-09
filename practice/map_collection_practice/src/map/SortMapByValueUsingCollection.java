package map;

import java.security.Key;
import java.util.*;

public class SortMapByValueUsingCollection {
    public static void main(String[] args) {
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();
        //Insert Id-Name pairs into idNameMap
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        System.out.println("original hashMap = "  +idNameMap);
       /*
        // declare one List and add map into it
        List<Map.Entry<Integer,String>> list  = new LinkedList<>(idNameMap.entrySet());
        System.out.println("list = "+list);
        list.sort(Map.Entry.comparingByValue());
        System.out.println("sorted list by value "+list);
        // add these sorted list in map again
        Map<Integer,String> sortedMapByValue = new HashMap<>();
        for(Map.Entry<Integer,String> i : list){
            sortedMapByValue.put(i.getKey(),i.getValue());
        }
        System.out.println("sorted map by value is = "+sortedMapByValue);*/
    }
}
