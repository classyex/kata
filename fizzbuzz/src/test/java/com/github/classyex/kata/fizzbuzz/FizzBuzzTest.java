package com.github.classyex.kata.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void should_be_1_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz(1);
        Assertions.assertEquals("1", fizzBuzz.of());
    }

    @Test
    public void should_be_2_given_2() {
        FizzBuzz fizzBuzz = new FizzBuzz(2);
        Assertions.assertEquals("2", fizzBuzz.of());
    }

    @Test
    public void should_be_fizz_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz(3);
        Assertions.assertEquals("fizz", fizzBuzz.of());
    }

    @Test
    public void should_be_fizz_given_12() {
        FizzBuzz fizzBuzz = new FizzBuzz(12);
        Assertions.assertEquals("fizz", fizzBuzz.of());
    }

    @Test
    public void should_be_buzz_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(5);
        Assertions.assertEquals("buzz", fizzBuzz.of());
    }

    @Test
    public void should_be_buzz_given_10() {
        FizzBuzz fizzBuzz = new FizzBuzz(10);
        Assertions.assertEquals("buzz", fizzBuzz.of());
    }

    @Test
    public void should_be_fizzbuzz_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz(15);
        Assertions.assertEquals("fizzbuzz", fizzBuzz.of());
    }

    @Test
    public void should_be_fizzbuzz_given_30() {
        FizzBuzz fizzBuzz = new FizzBuzz(30);
        Assertions.assertEquals("fizzbuzz", fizzBuzz.of());
    }







}
