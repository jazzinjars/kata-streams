package com.jazzinjars.katas.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;
import static com.jazzinjars.katas.streams.UpperCase.transform;

class UpperCaseKataSpec extends KataBaseSpec {

	@Test
	void transform_should_convert_collection_elements_to_upper_case() {
		List<String> collection = asList("You", "know", "nothing", "John", "Snow");
		List<String> expected = asList("YOU", "KNOW", "NOTHING", "JOHN", "SNOW");

		assertThat(transform(collection)).hasSameElementsAs(expected);
	}

}
