package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int currentRow = 1;

        while (currentRow <= cathetusLength) {
            for (int i = currentRow; i < cathetusLength; i++) {
                System.out.print(" ");
            }

            for (int i = currentRow; i > 1; i--) {
                System.out.print(i);
            }

            for (int i = 1; i <= currentRow; i++) {
                System.out.print(i);
            }

            System.out.println();
            currentRow++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
