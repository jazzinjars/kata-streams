package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.jazzinjars.katas.streams.Grouping.groupByHouse;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class GroupingKataSpec extends KataBaseSpec {

    @Test
    public void partition_people_from_houses() {
        Map<String, List<Person>> result = groupByHouse(personList);
        assertThat(result.get("Stark")).hasSameElementsAs(asList(sansa, catelyn));
        assertThat(result.get("Lannister")).hasSameElementsAs(asList(cersei));
    }

}
