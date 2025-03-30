package de.mikhalachkin.kmp;

/**
 * Mikalai Mikhalachkin
 * Mtr. Nummer: 400275441
 * Modul: Algorithmen und Datenstrukturen (M652)
 * Studiengang: Digital Health
 */

public class KmpSearch {

  private static int[] initNext(String pattern) {
    if (pattern.isEmpty()) return new int[0];

    int[] next = new int[pattern.length()];
    int i = 0, j = -1;
    next[0] = -1;

    while (i < pattern.length() - 1) {
      if (j == -1 || pattern.charAt(i) == pattern.charAt(j)) {
        i++;
        j++;
        next[i] = j;
      } else {
        j = next[j];
      }
    }
    return next;
  }


  public static int kmpSearch(String text, String pattern) {
    if (pattern.isEmpty()) return 0;

    int[] next = initNext(pattern);
    int i = 0, j = 0;

    while (i < text.length()) {
      if (j == -1 || text.charAt(i) == pattern.charAt(j)) {
        i++;
        j++;
        if (j == pattern.length()) {
          return i - j;
        }
      } else {
        j = next[j];
      }
    }

    return -1;
  }
}
