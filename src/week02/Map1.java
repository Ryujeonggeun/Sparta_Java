package week02;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        // Map 은 key : value 가 pair 란점이 매우 중요!!
        // Key 라는 값으로 unique하게 보장이 돼야 함!!
        // Map -> HashMap, TreeMap으로 응용!

        Map<String,Integer> intMap = new HashMap<>(); //선언

        // 키 값
        intMap.put("일",1);
        intMap.put("이",2);
        intMap.put("삼",3); //중복된 놈은 덮어씀
        intMap.put("삼",4);
        intMap.put("오",5);

        // key 값 전체 출력(향상된 for문)
        for (String key : intMap.keySet()) {
            System.out.println(key);
        }

        //값 전체 출력(향상된 for문)
        for (Integer value : intMap.values()) {
            System.out.println(value);
        }

        System.out.println(intMap.get("삼"));
    }
}
