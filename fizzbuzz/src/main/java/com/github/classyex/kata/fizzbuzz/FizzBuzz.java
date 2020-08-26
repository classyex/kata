package com.github.classyex.kata.fizzbuzz;

/**
 * @author Administrator
 */
public class FizzBuzz {


    private int input;

    public FizzBuzz(int input) {
        this.input = input;
    }

    public String of() {
        String result = "";
        if (divisionBy(3)) {
            result += "fizz";
        }
        if (divisionBy(5)) {
            result += "buzz";
        }
        if (result.length() == 0) {
            result += input;
        }
        return result;
    }

    private boolean divisionBy(int num) {
        return input % num == 0;
    }
}
