package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import static com.jazzinjars.katas.streams.Joining.namesToString;
import static org.assertj.core.api.Assertions.assertThat;

class JoiningKataSpec extends KataBaseSpec {

    @Test
    void to_string_should_return_people_names_separated_by_comma() {
        assertThat(namesToString(personList))
                .isEqualTo("Names: Sansa, Cersei, Catelyn.");
    }

}
