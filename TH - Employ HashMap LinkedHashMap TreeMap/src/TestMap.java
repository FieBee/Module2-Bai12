import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Smith", 30);
        treeMap.put("Anderson", 31);
        treeMap.put("Lewis", 29);
        treeMap.put("Cook", 29);
        treeMap.put("Cook", 222);
        System.out.println("Display entries in HashMap");
        System.out.println(treeMap + "\n");


        Map<String, Integer> hashMap = new HashMap<>(treeMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(hashMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
        System.out.println( linkedHashMap);




    }
}
