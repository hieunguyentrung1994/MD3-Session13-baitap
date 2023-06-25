package bt3_1;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("name", 19);
        map.put("name1", 18);
        map.put("name2", 13);
        map.put("name3", 12);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        //  Sắp xếp danh sách theo giá trị tăng dần
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().compareTo(entry2.getValue());
            }
        });
        System.out.println(entryList);
        // Sắp xếp danh sách theo giá trị giảm dần
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });
        System.out.println(entryList);
    }
}
