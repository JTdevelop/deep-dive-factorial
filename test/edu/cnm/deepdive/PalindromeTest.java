package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import static edu.cnm.deepdive.Palindrome.isPalindrome;

import org.junit.jupiter.api.Test;

class PalindromeTest {

  private static final String[] PALINDROMES = {
      "Madam, I'm Adam!",
      "A Toyota's a Toyota",
      "Radar",
      "A man, a plan, a canal - Panama!"
  };
  private static final String[] NON_PALINDROMES = {
      "ab",
      "abbac",
      "A Toyota is a Toyota"
  };

  @Test
  void testInterestingPalindromes() {
    for (String test : PALINDROMES) {
      assertTrue(isPalindrome(test));
    }
    for (String test : NON_PALINDROMES) {
      assertFalse(isPalindrome(test));
    }

  }

  @Test
  void testDegeneratePalindromes() {
    assertTrue(isPalindrome(""));
    assertTrue(isPalindrome("A"));
  }

}