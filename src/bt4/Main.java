package bt4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> list1 = new HashMap<>();
        list1.put("foo", 1);
        list1.put("bar", 2);
        list1.put("baz", 3);
        Map<String, Integer> list2 = new HashMap<>();
        list2.put("foo1",4);
        list2.put("bar1",5);
        list2.put("baz1",6);


        // putAll(list)
        list2.putAll(list1);

        System.out.println(list2);
    }
}
