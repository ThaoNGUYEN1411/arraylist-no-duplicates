package org.example.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    void givenArrayList_whenUsingAnyMatch_thenAvoidDuplicates() {
        final var distinctCities = Arrays.asList("Tamassint", "Madrid", "Paris", "Tokyo");
        final var arrayListCities = new ArrayList<>(distinctCities);
        final var newCity = "Tamassint";
        final var isCityPresent = arrayListCities.stream().anyMatch(city -> city.equals(newCity));
        if (!isCityPresent) {
            arrayListCities.add(newCity);
        }
        assertEquals(arrayListCities.size(), distinctCities.size());
    }

    @Test
    void testTrue(){
        assertTrue(false);
    }
}
