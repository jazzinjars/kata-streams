package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.jazzinjars.katas.streams.Kids.getKidNames;
import static org.assertj.core.api.Assertions.assertThat;

public class KidsKataSpec extends KataBaseSpec {

    @Test
    public void get_kid_name_should_return_names_of_younger_than_18() {
        Person arya = new Person("Arya", 5);
        List<Person> people = new ArrayList<>(personList);
        people.add(arya);

        assertThat(getKidNames(people))
                .contains("Sansa", "Arya")
                .doesNotContain("Cersei", "Catelyn");
    }

}
