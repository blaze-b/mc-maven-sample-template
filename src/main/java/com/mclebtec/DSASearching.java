package com.mclebtec;

public class DSASearching {

  /**
   * Best Case: O(1) (when the target is the first element). Average and Worst Case: O(n), where n
   * is the number of elements in the array. Simple to implement. Works on both sorted and unsorted
   * arrays. Inefficient for large datasets. Time complexity increases linearly with the size of the
   * dataset.
   *
   * @param searchArray
   * @param target
   * @return
   */
  public int linearSearch(final int[] searchArray, final int target) {

    for (int j : searchArray) {
      if (j == target) {
        return j;
      }
    }

    return -1;

  }

  /**
   Best Case: O(1) (when the target is the middle element).
   Average and Worst Case: O(log n), where n is the number of elements in the array.
   Extremely efficient for large datasets.
   Logarithmic time complexity (O(log n)).
   Requires the array to be sorted.
   More complex to implement compared to Linear Search.
   * @param searchArray
   * @param target
   * @return
   */
  public int binarySearch(final int[] searchArray, final int target) {

    int left = 0;
    int right = searchArray.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      // if target id the middle element
      if (searchArray[mid] == target) {
        return searchArray[mid];
      }

      // if target is greater, ignore the left half
      if (searchArray[mid] < target) {
        left = mid + 1;
      }
      // if target is smaller, ignore the right half
      else {
        right = mid - 1;
      }

    }

    return -1;

  }

}
