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
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
