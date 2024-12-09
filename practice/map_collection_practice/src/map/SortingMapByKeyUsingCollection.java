package map;

import java.util.*;

public class SortingMapByKeyUsingCollection {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("a", 87);
        studentMap.put("vv", 82);
        studentMap.put("djsfdd", 91);
        studentMap.put("lfjeioi", 89);
        studentMap.put("ueieieieiut", 95);
        studentMap.put("qiieitqq", 86);
        studentMap.put("wiieee", 92);
        studentMap.put("ttieht", 51);
        studentMap.put("cicc", 85);
        studentMap.put("zz90909090z", 5);
        System.out.println("\noriginal map = "+studentMap);
        // sort HashMap by key by using SortedMap
        SortedMap<String,Integer> sortedMap =  new TreeMap<>(studentMap);
        System.out.println("after sorting map = "+sortedMap);

        // reverse sort using treemap
        Map<String,Integer> revSort = new TreeMap<>(Collections.reverseOrder());
        revSort.putAll(studentMap);
        System.out.println("reverse order map = "+revSort);

        // sort the map using custom order i.e by length
        Map<String,Integer> customSort = new TreeMap<>(new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                return -(o1.length()-o2.length());
            }
        });
        customSort.putAll(studentMap);
        System.out.println("sort by length = "+customSort);
    }
}
