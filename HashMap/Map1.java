package HashMap;
import java.security.KeyStore.Entry;
import java.util.*;
public class Map1 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(2, 1);
        map.put(2, 5);
        // Iterator<Entry<Integer, Integer>> iter = map.entrySet().iterator();
        map.forEach((key, v)-> {
            System.out.println(key + " : "+ v);
        });
        // HashMap map1 = map.clone();
        // System.out.println(map);
    }
    
}
