# Big O Notation Algorithms in Java

This Java file, `bigo.java`, contains implementations of various algorithms showcasing different time complexities in Big O notation.

## Implemented Algorithms

### O(n) Algorithm: Insertion into a List
The method `insertInList` in the code represents an O(n) algorithm for sequentially inserting an element into a list. It dynamically adjusts the size of the list, shifts elements to create space, and inserts the element at the specified index.

### O(n^2) Algorithm: 2D Array Iteration
The method `iterate2DArray` demonstrates an O(n^2) algorithm that iterates over a 2D array of integers. It uses nested loops to traverse through each element in the array and print its values.

### O(log n) Algorithm: Insertion into a Sorted List
The `insertListInSorted` method simulates an O(log n) algorithm for inserting an element into a sorted list. It utilizes a binary search approach to find the correct index and then utilizes the O(n) insertion method to add the new element at the appropriate position.

## Usage
The `main` method provides an example usage of the implemented algorithms. It showcases how each of the three different time complexity algorithms can be utilized.

## Note
This project is a practical demonstration of various time complexities in algorithms as defined by Big O notation, representing different computational efficiencies in different scenarios.

## How to Run
Compile and run the `bigo.java` file to test and observe the functionalities of the implemented algorithms.

## License
This project is released under the MIT License.
