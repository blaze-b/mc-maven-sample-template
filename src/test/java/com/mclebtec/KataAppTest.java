package com.mclebtec;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class KataAppTest {

  @ParameterizedTest
  @ValueSource(strings = {"John Doe"})
  public void welcome_test(String input) {
    Assertions.assertEquals("Hello John Doe", new KataApp().welcome(input));
  }

  @ParameterizedTest
  @CsvSource({"John Doe,Hello John Doe", "John Dow,Hello John Dow"})
  public void welcome_test(String input, String expectedResult) {
    Assertions.assertEquals(expectedResult, new KataApp().welcome(input));
  }

}
