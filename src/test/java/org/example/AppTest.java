package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @ValueSource(ints = {30, 65})
    @ParameterizedTest
    public void firstTest(int age) {
        Assertions.assertTrue(age < 66 && age > 29);
    }

    @ValueSource(ints = {18, 29})
    @ParameterizedTest
    public void secondTest(int age) {
        Assertions.assertTrue(age > 17 && age < 30);
    }

    @ValueSource(ints = {66, 79})
    @ParameterizedTest
    public void thirdTest(int age) {
        Assertions.assertTrue(age > 65 && age < 80);
    }

    @ValueSource(ints = {17, 80})
    @ParameterizedTest
    public void zeroTest (int age) {
        Assertions.assertFalse(false);
    }


}


