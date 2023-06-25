package bt5;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> check = new HashMap<>();
        check.put("name",1);
        check.put("host",2);
        check.put("port",3);

        System.out.println(check.containsKey("name"));
        System.out.println(check.containsKey("host1"));
    }
}
