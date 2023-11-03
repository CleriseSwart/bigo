package CompTask;

import java.util.ArrayList;
import java.util.List;

public class bigo {
    public static void main(String[] args) {
        // Example usage of the three algorithms

        // 1. O(n) algorithm that sequentially inserts an element into a list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        System.out.println("Before the element is inserted: " + list);
        insertInList(list, 2, 1);
        System.out.println("After the element was inserted: " + list);

        // 2. O(n^2) algorithm that iterates over a 2D array of integers
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Iterating over the 2D array:");
        iterate2DArray(arr);

        // 3. O(log n) algorithm that sequentially inserts an element into a list
        List<Integer> sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(3);
        sortedList.add(4);
        System.out.println("Before the element is inserted: " + sortedList);
        insertListInSorted(sortedList, 2);
        System.out.println("After the element was inserted: " + sortedList);
    }

    // O(n) algorithm to sequentially inserting an element into a list
    public static void insertInList(List<Integer> list, int element, int index) {
        int size = list.size();

        if (index > size) { // check if the index is valid
            throw new IndexOutOfBoundsException("Index is outside of list size.");
        }

        list.add(0); // increase list size by 1

        // Shift elements to the right to make room for the new element
        for (int i = size - 1; i >= index; i--) {
            list.set(i + 1, list.get(i));
        }

        list.set(index, element); // insert the new element at the desired index
    }

    // O(n^2) algorithm for iterating over a 2D array of integers
    public static void iterate2DArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Loop through each row and column of the array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " "); // Print the current element
            }
            System.out.println(); // Move to the next row
        }
    }

    // O(log n) algorithm for sequentially inserting an element into a sorted list
    // https://www.youtube.com/watch?v=P3YID7liBug
    public static void insertListInSorted(List<Integer> list, int element) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < element) {
                index = i + 1;
            } else {
                break;
            }
        }
        insertInList(list, element, index);
    }
}
