package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder implements Comparator<String> {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> developers = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                developers.add(entry.getKey());
            }
        }
        developers.sort(this);
        return developers;
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.length()==o2.length()){
            return o2.compareTo(o1);
        }
        return o2.length()-o1.length();
    }
}

