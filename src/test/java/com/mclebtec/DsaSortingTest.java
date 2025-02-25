package com.mclebtec;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class DsaSortingTest {

  @Test
  void bubbleSort_SortElements_Success() {
    // GIVEN
    int[] inputArray = {64, 34, 25, 12, 22, 11, 90};
    int[] expectedArray = {11, 12, 22, 25, 34, 64, 90};

    // WHEN
    DsaSorting dsaSorting = new DsaSorting();
    dsaSorting.bubbleSort(inputArray);

    assertArrayEquals(expectedArray, inputArray);
  }

  @Test
  void insertionSort_SortElements_Success() {
    // GIVEN
    int[] inputArray = {64, 34, 25, 12, 22, 11, 90};
    int[] expectedArray = {11, 12, 22, 25, 34, 64, 90};

    // WHEN
    DsaSorting dsaSorting = new DsaSorting();
    dsaSorting.insertionSort(inputArray);

    assertArrayEquals(expectedArray, inputArray);
  }

  @Test
  void selectionSort_SortElements_Success() {
    // GIVEN
    int[] inputArray = {64, 34, 25, 12, 22, 11, 90};
    int[] expectedArray = {11, 12, 22, 25, 34, 64, 90};

    // WHEN
    DsaSorting dsaSorting = new DsaSorting();
    dsaSorting.selectionSort(inputArray);

    assertArrayEquals(expectedArray, inputArray);
  }

}
