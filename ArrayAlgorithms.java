import java.util.ArrayList;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 5, 5, 8 };

        // Array
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("");

        // Array - Arraylist

        // Sum + Mean
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
        double mean = sum / arr.length;
        System.out.println("Mean: " + mean);

        // Smallest + Largest
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Smallest value: " + (min));
        System.out.println("Largest value: " + (max));

        // Mode
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }

        int maxCount = Integer.MIN_VALUE;
        int maxCountIndex = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxCountIndex = i;
            }
        }
        System.out.println("Mode: " + (maxCountIndex));

        // Reversing Array
        int[] reverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[arr.length - i - 1] = arr[i];
        }

        System.out.print("Reversed array: ");
        for (int num : reverse) {
            System.out.print(num + " ");
        }
        System.out.println("");

        // Shift Array By Given Integer
        int[] shiftedArray = new int[arr.length];
        int shiftAmount = 2;
        for (int i = 0; i < arr.length; i++) {
            shiftedArray[(i + shiftAmount) % arr.length] = arr[i];
        }

        System.out.print("Shifted array: ");
        for (int num : shiftedArray) {
            System.out.print(num + " ");
        }
        System.out.println("");

        // Array List
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        // Add 10 Random Numbers
        for (int i = 0; i < 10; i++) {
            numbersList.add((int) (Math.random() * 100));
        }

        // Print the List
        System.out.println("ArrayList: " + numbersList);

        // Sum of the List
        int arraySum = 0;
        for (int number : numbersList) {
            arraySum += number;
        }
        System.out.println("ArrayList Sum: " + arraySum);

        // Mean of the List
        int arrayMean = arraySum / numbersList.size();
        System.out.println("ArrayList Mean: " + arrayMean);

        // Smallest Number
        int min2 = Integer.MAX_VALUE;
        for (int number : numbersList) {
            if (number < min2) {
                min2 = number;
            }
        }
        System.out.println("ArrayList smallest value: " + min2);

        // Largest Number
        int max2 = Integer.MIN_VALUE;
        for (int number : numbersList) {
            if (number > max2) {
                max2 = number;
            }
        }
        System.out.println("ArrayList largest value: " + max2);

        // Mode

        // Reverse
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        for (int number : numbersList) {
            reverseList.add(0, number);
        }
        System.out.println("Reversed list: " + reverseList);

        // Shift by an Integer
        ArrayList<Integer> shiftedList = new ArrayList<Integer>();
        int shift = 2;
        int index = 0;
        for (int number : numbersList) {
            if (shift > 9) {
                shiftedList.add(index, number);
                index++;A
                shift++;
            } else {
                shiftedList.add(number);
                shift++;
            }
        }
        System.out.println("Shifted list: " + shiftedList);
    }
}