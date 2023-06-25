package bt1;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("hieu", "hung", "binh", "khanh", "khanh", "khanh", "binh"));

        System.out.println(words);
        Map<String, Integer> map = new HashMap<>();
        for (String word : words){
            if (map.containsKey(word)){
                int value = map.get(word);
                map.put(word,value +1);
            }else{
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}