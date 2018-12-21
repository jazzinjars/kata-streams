package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import static com.jazzinjars.katas.streams.PeopleStats.getStats;
import static org.assertj.core.api.Assertions.assertThat;

class PeopleStatsKataSpec extends KataBaseSpec {

    @Test
    void get_stats_should_return_average_age() {
        assertThat(getStats(personList).getAverage())
                .isEqualTo((double)(4 + 40 + 42) / 3);
    }

    @Test
    void get_stats_should_return_number_of_people() {
        assertThat(getStats(personList).getCount())
                .isEqualTo(3);
    }

    @Test
    void get_stats_should_return_maximum_age() {
        assertThat(getStats(personList).getMax())
                .isEqualTo(42);
    }

    @Test
    void get_stats_should_return_minimum_age() {
        assertThat(getStats(personList).getMin())
                .isEqualTo(4);
    }

    @Test
    void get_stats_shoul_return_sum_of_all_ages() {
        assertThat(getStats(personList).getSum())
                .isEqualTo(40 + 42 + 4);
    }
}
