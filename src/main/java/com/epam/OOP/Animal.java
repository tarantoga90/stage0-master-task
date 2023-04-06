package com.epam.OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paws = this.numberOfPaws == 1 ? "paw" : "paws";
        String fur = this.hasFur ? "a" : "no";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " " + paws + " and " + fur + " fur.";
    }
}
