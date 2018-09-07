package com.jazzinjars.katas.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    private Grouping() {
    }

    public static Map<String, List<Person>> groupByHouse7(List<Person> people) {
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!map.containsKey(person.getHouse())) {
                map.put(person.getHouse(), new ArrayList<>());
            }
            map.get(person.getHouse()).add(person);
        }
        return map;
    }

    public static Map<String, List<Person>> groupByHouse(List<Person> people) {
        return people.stream()                                      // Convert collection to Stream
                .collect(Collectors.groupingBy(Person::getHouse));  // Group people by house
    }

}
