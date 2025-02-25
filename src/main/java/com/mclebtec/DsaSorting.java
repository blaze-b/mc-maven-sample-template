package com.mclebtec;

public class DsaSorting {

  /**
   * Best Case: O(n) (when the array is already sorted). Average and Worst Case: O(n²) (when the
   * array is in reverse order or random). O(1) (in-place sorting algorithm).O(1) (in-place sorting
   * algorithm). Simple to Implement: Easy to understand and code. No Additional Memory: Sorts in
   * place, requiring only a constant amount of extra memory. Inefficient for Large Datasets: Time
   * complexity of O(n²) makes it unsuitable for large datasets. Poor Performance: Even with
   * optimization, it performs poorly compared to more advanced algorithms like QuickSort or
   * MergeSort.
   *
   * @param arrayList
   */
  public void bubbleSort(int[] arrayList) {
    int n = arrayList.length;

    boolean swapped;

    for (int i = 0; i < n - 1; i++) {

      swapped = false;

      for (int j = 0; j < n - 1 - i; j++) {
        if (arrayList[j] > arrayList[j + 1]) {
          int temp = arrayList[j];
          arrayList[j] = arrayList[j + 1];
          arrayList[j + 1] = temp;
          swapped = true;
        }
      }

      // If no elements were swapped, the array is already sorted
      if (!swapped) {
        break;
      }

    }
  }

  /**
   * @param array
   */
  public void insertionSort(int[] array) {
    int n = array.length;

    for (int i = 0; i < n - 1; i++) {
      int key = array[i];
      int j = i - 1;

      while (j >= 0 && array[j] > key) {
        array[j + 1] = array[j];
        j--;
      }

      array[j + 1] = key;
    }
  }

  public void selectionSort(int[] array) {

    int n = array.length;

    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }

      }
      int temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }

  }

}
