package com.mclebtec;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzKataTest {


  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15})
  public void convert_number_to_string_test(int input) {
    String convertedValue = new FizzBuzzKata().convert(input);
    Assertions.assertNotNull(convertedValue);
  }


  @ParameterizedTest
  @CsvSource({
      "1,1",
      "2,2",
      "3,FIZZ",
      "4,4",
      "10,BUZZ"
  })
  public void convert_number_to_string_test(String input, String output) {
    String convertedValue = new FizzBuzzKata().convert(Integer.parseInt(input));
    Assertions.assertEquals(output, convertedValue);
  }

}
