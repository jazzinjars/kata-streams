package com.jazzinjars.katas.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Kids {

    public static Set<String> getKidNames7(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }

    public static Set<String> getKidNames(List<Person> people) {
        return people.stream()
                .filter(person -> person.getAge() < 18) // Filter kids (under age of 18)
                .map(Person::getName)                   // Map Person elements to names
                .collect(Collectors.toSet());                      // Collect values to a Set
    }

}
