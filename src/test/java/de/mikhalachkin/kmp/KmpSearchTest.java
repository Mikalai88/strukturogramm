package de.mikhalachkin.kmp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KmpSearchTest {

  @Test
  void testPatternFound() {
    String text = "abrakadabra";
    String pattern = "dab";
    int result = KmpSearch.kmpSearch(text, pattern);
    assertEquals(6, result);
  }

  @Test
  void testPatternNotFound() {
    String text = "have a nice day";
    String pattern = "has";
    int result = KmpSearch.kmpSearch(text, pattern);
    assertEquals(-1, result);
  }
}
