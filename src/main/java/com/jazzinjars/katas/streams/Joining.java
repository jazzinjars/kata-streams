package com.jazzinjars.katas.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {

    private Joining() {
    }

    public static String namesToString7(List<Person> people) {
        String label = "Names: ";
        StringBuilder sb = new StringBuilder(label);
        for (Person person : people) {
            if (sb.length() > label.length()) {
                sb.append(", ");
            }
            sb.append(person.getName());
        }
        sb.append(".");
        return sb.toString();
    }

    public static String namesToString(List<Person> people) {
        return people.stream()                                          // Convert collection to Stream
                .map(Person::getName)                                   // Map Person to name
                .collect(Collectors.joining(", ", "Names: ", ".")); // Join names
    }

}
