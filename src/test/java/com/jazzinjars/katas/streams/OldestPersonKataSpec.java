package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jazzinjars.katas.streams.OldestPerson.getOldestPerson;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class OldestPersonKataSpec extends KataBaseSpec {

    @Test
    public void get_oldest_person_should_return_oldest_person() {
        List<Person> collection = asList(sansa, cersei, catelyn);
        assertThat(getOldestPerson(collection)).isEqualToComparingFieldByField(catelyn);
    }

}
