package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static com.jazzinjars.katas.streams.Partitioning.partitionAdults;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PartitioningKataSpec extends KataBaseSpec {

    @Test
    public void partition_adults_should_separate_kids_from_adults() {
        Map<Boolean, List<Person>> result = partitionAdults(personList);
        assertThat(result.get(true)).hasSameElementsAs(asList(cersei, catelyn));
        assertThat(result.get(false)).hasSameElementsAs(asList(sansa));
    }

}
