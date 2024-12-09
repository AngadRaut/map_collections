package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByKayJava8 {
    public static void main(String[] args) {
        Map<Integer, String> idNameMap = new HashMap<Integer, String>();
        //Insert Id-Name pairs into idNameMap
        idNameMap.put(111, "Lisa");
        idNameMap.put(222, "Narayan");
        idNameMap.put(333, "Xiangh");
        idNameMap.put(444, "Arunkumar");
        idNameMap.put(555, "Jyous");
        idNameMap.put(666, "Klusener");
        System.out.println("\noriginal Map = "+idNameMap);

        // sort by  key using java - 8
        Map<Integer,String> sortedMap = idNameMap.entrySet().stream().
                sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e2,LinkedHashMap::new));
        System.out.println("sorted map by key in natural order using java 8 = "+sortedMap);

        // sort by key in reverse order
        Map<Integer,String> sortedMapReverseOrder = idNameMap.entrySet().stream()
                        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1,e2)->e1,
                        LinkedHashMap::new));

    }
}
