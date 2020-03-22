package find.minmax.array;

import java.util.Scanner;

public class FindMinMaxArray {
    private static void fillArray(int[] list, int n) {
        Scanner console = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            list[i] = console.nextInt();
        }
    }
    public static void printArray(int[] list, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(list[i] + " ");
        }
    }
    public static int sumArray(int[] list, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += list[i];
        }
        return sum;
    }

    public static int maxValueOfArray (int[] list, int n) {
        int maxArray = list[0];
        for (int i = 0; i < n ; i++) {
            if (maxArray < list[i]) {
                maxArray = list[i];
            }
        }
        return maxArray;
    }

    public static int largestElement(int[] list, int n) {
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (list[max] < list[i]) {
                max = i;
            }
        }
        return max;
    }

    public static int minValueOfArray (int[] list, int n) {
        int  minArray = list[0];
        for (int i = 0; i < n; i++) {
            if (minArray > list[i]) {
                minArray = list[i];
            }
        }
        return minArray;
    }

    public static int smallestElement(int[] list, int n) {
        int min = 0;

        for (int i = 1; i < n; i++) {
            if (list[min] > list[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        final int SIZE = 5;

        int[] array = new int[SIZE];

        System.out.println("Enter numbers ");
        FindMinMaxArray.fillArray(array, SIZE);

        System.out.println("Numbers are :");
        FindMinMaxArray.printArray(array, SIZE);
        System.out.println();

        System.out.println("The sum of the elements is: " + FindMinMaxArray.sumArray(array, SIZE));
        System.out.println("The max value of Array is: " + FindMinMaxArray.maxValueOfArray(array, SIZE));
        System.out.println("Largest element is at index " + FindMinMaxArray.largestElement(array, SIZE));
        System.out.println("The min value of Array is: " + FindMinMaxArray.minValueOfArray(array, SIZE));
        System.out.println("Smallest element is at index: " + FindMinMaxArray.smallestElement(array, SIZE));
    }
}
