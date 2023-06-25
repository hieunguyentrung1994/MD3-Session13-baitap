package bt2;


import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] words1 = { "hieu", "hung", "binh", "khanh", "phú", "hung", "binh", "khanh", "phú"};
        Map<String, Integer> map = new HashMap<>();

        for(String word : words1) {
            if (map.containsKey(word)){
                int value = map.get(word);
                map.put(word, value+1);
            }else{
                map.put(word, 1);
            }
        }


        List<String> words2 = new ArrayList<>();
        for(String maps : map.keySet()){
            if(map.get(maps) == 1){
                words2.add(maps);
            }
        }



        System.out.println(map);
        System.out.println("các từ không bị trung lặp là" + words2);
    }
}