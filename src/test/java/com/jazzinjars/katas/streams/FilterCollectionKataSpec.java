package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jazzinjars.katas.streams.FilterCollection.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

class FilterCollectionKataSpec {

    @Test
    void transform_keep_strings_shorter_than_4_characters() {
        List<String> collection = asList("My", "name", "is", "John", "Snow");
        List<String> expected = asList("My", "is");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}
