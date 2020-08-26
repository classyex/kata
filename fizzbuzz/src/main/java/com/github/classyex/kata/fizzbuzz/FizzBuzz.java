package com.github.classyex.kata.fizzbuzz;

/**
 * @author Administrator
 */
public class FizzBuzz {


    private Integer input;

    public FizzBuzz(int input) {
        this.input = input;
    }

    public String of() {
        String result = "";
        if (relationTo(3)) {
            result += "fizz";
        }
        if (relationTo(5)) {
            result += "buzz";
        }
        if (result.length() == 0) {
            result += input;
        }
        return result;
    }

    private boolean relationTo(int num) {
        return divisionBy(num) || contains(num + "");
    }

    private boolean contains(String num) {
        return input.toString().contains(num);
    }

    private boolean divisionBy(int num) {
        return input % num == 0;
    }
}
