package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<String, Integer> firstMap = new HashMap<>();
        for (String key : sourceMap.keySet()) {
            firstMap.put(key, key.length());
        }
        Map<Integer, Set<String>> finalMap = new HashMap<>();
        for (Integer i : firstMap.values()) {
            Set<String> set = new HashSet<>();
            for (Map.Entry<String, Integer> entry : firstMap.entrySet()) {
                if (i.equals(entry.getValue())) {
                    set.add(entry.getKey());
                }
            }
            finalMap.put(i, set);
        }
        return finalMap;
    }
}
