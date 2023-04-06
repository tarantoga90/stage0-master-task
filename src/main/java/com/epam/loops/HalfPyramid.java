package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        int currentRow = 1;

        while (currentRow <= cathetusLength) {
            for (int i = currentRow; i < cathetusLength; i++) {
                System.out.print(" ");
            }

            for (int i = currentRow; i >= 1; i--) {
                System.out.print("*");
            }

            System.out.println();
            currentRow++;
        }
    }



    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
