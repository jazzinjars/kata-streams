package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.jazzinjars.katas.streams.FlatCollection.transform;
import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class FlatCollectionKataSpec {

    @Test
    public void transformShouldFlattenCollection() {
        List<List<String>> collection = asList(asList("Sansa", "Stark"), asList("John", "Snow", "Stark"));
        List<String> expected = asList("Sansa", "Stark", "John", "Snow", "Stark");
        assertThat(transform(collection)).hasSameElementsAs(expected);
    }

}
