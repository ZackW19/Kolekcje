//Mapy

import java.util.HashMap;
import java.util.Map;

public class Main5 {
    public static void main(String[] args) {
        Map<Integer, String> stringMap = new HashMap<>();  //może być Map<String, Integer> można dawać też inne typy generyczne
        stringMap.put (1, "Krowa");                         //stringMap.put ("Krowa", 1);
        stringMap.put(2, "Pies");
        stringMap.put(5, "Zając");
        stringMap.put(10,"Jaskółka");

        System.out.println(stringMap.get(10));

    }
}
