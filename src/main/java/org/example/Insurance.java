package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Insurance {
    @ValueSource(doubles = {5.0, 4.0})
    @ParameterizedTest
    public void firstTest(double value) {
        Assertions.assertTrue(value > 3);
    }
}
