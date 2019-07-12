package com.thoughtworks.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @BeforeAll
    static void initTestEnv() {
    }

    @BeforeEach
    void initEveryMethod() {
    }

    @Test
    public void should_return_1_when_convert_given_1() {
        // given
        int number = 1;

        // when
        String output = new FizzBuzz().convert(number);

        // then
        assertEquals(String.valueOf(number), output);
    }

    @Test
    public void should_return_Fizz_when_convert_given_3() {
        // given
        int number = 3;

        // when
        String output = new FizzBuzz().convert(number);

        // then
        assertEquals("Fizz", output);
    }

    @Test
    public void should_return_Buzz_when_convert_given_10() {
        // given
        int number = 10;

        // when
        String output = new FizzBuzz().convert(number);

        // then
        assertEquals("Buzz", output);
    }

    @Test
    public void should_return_FizzBuzz_when_convert_given_15() {
        // given
        int number = 15;

        // when
        String output = new FizzBuzz().convert(number);

        // then
        assertEquals("FizzBuzz", output);
    }
}