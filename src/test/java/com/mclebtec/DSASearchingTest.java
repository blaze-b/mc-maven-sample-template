package com.mclebtec;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DSASearchingTest {

  @Test
  void linearSearch_SearchForAValue_ValueIsPresentAndReturnsSuccessfully() {
    // GIVEN
    int[] searchArray = new int[]{1, 3, 4, 5, 6, 7};

    // WHEN
    DSASearching dsaSearching = new DSASearching();
    int target = dsaSearching.linearSearch(searchArray, 6);

    // THEN
    assertEquals(6, target);
  }

  @Test
  void linearSearch_SearchForAValue_ValueIsNotPresentAndReturnsSuccessfully() {
    // GIVEN
    int[] searchArray = new int[]{1, 3, 4, 5, 6, 7};

    // WHEN
    DSASearching dsaSearching = new DSASearching();
    int target = dsaSearching.linearSearch(searchArray, 10);

    // THEN
    assertEquals(-1, target);
  }

  @ParameterizedTest
  @ValueSource(ints = {3, 4, 8, 1, 7})
  void binarySearch_SearchWithValidValue_ValuesIsPresentAndReturnsSuccessfully(
      final int expectedValue) {
    // GIVEN
    int[] searchArray = new int[]{1, 3, 4, 2, 6, 10, 7, 8, 23};

    // WHEN
    DSASearching dsaSearching = new DSASearching();
    int target = dsaSearching.binarySearch(searchArray, expectedValue);

    //THEN
    assertEquals(expectedValue, target);
  }

}
