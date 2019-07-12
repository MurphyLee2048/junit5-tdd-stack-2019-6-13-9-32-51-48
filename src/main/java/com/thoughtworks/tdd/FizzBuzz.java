package com.thoughtworks.tdd;

public class FizzBuzz {
    public String convert(int number) {
        String result = null;
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return result;
    }
}
