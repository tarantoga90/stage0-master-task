package com.epam.algorithms;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int result = 0;

        for (int i : arr) {
            result += i;
        }

        return result;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String buffer;

        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            buffer = arr[i];
            arr[i] = arr[j];
            arr[j] = buffer;
        }

        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int length = 0;

        for (int i : arr) {
            if (i > 0) {
                length += 1;
            }
        }

        int[] newArray = new int[length];
        int currentPosition = 0;

        for (int i : arr) {
            if (i > 0) {
                newArray[currentPosition] = i;
                currentPosition++;
            }
        }

        return newArray;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

        for (int i = 1; i < arr.length; i++) {
            int[] current = arr[i];
            int j = i - 1;
            while(j >= 0 && current.length < arr[j].length) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }

        for (int[] innerArray : arr) {
            for (int i = 1; i < innerArray.length; i++) {
                int current = innerArray[i];
                int j = i - 1;
                while(j >= 0 && current < innerArray[j]) {
                    innerArray[j+1] = innerArray[j];
                    j--;
                }

                innerArray[j+1] = current;
            }
        }

        return arr;
    }

}
