package map;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValueJava8 {
    public static void main(String[] args) {
        //Define one HashMap called idNameMap
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();
        //Insert Id-Name pairs into idNameMap
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
        System.out.println("original hash map = "+idNameMap);
        // sort the hashMap by value using java-8
        Map<Integer,String> sortedMapNaturalOrder = idNameMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new));
        System.out.println("sorted map in natural order by value = "+sortedMapNaturalOrder);

        // sort in reverse natural order
        Map<Integer,String> sortInRevNaturalOrder = idNameMap.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new));
        System.out.println("sorted map by values using java-8 in reverse order "+sortInRevNaturalOrder);
    }
}
