package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jazzinjars.katas.streams.Sum.calculate;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a personList
 */
class SumKataSpec {

    @Test
    void calculate_should_return_sum_of_all_integers_in_collection() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5);
        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
