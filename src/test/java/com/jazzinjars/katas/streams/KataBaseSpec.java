package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.BeforeAll;

import java.util.List;

import static java.util.Arrays.asList;

class KataBaseSpec {

    static List<Person> personList;
    static Person sansa;
    static Person cersei;
    static Person catelyn;

    @BeforeAll
    static void initializeResources() {
        sansa = new Person("Sansa", 4, "Stark");
        cersei = new Person("Cersei", 40, "Lannister");
        catelyn = new Person("Catelyn", 42, "Stark");
        personList = asList(sansa, cersei, catelyn);
    }
}
