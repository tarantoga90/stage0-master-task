package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String[] array = Integer.toString(number).split("");
        int result = 0;

        for (String s : array) {
            result += Integer.parseInt(s);
        }

        System.out.println(result);
    }

}
