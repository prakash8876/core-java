package io.matoshri.java.hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AreaOfParallelogramTests {
  private static int breadth;
  private static int height;

  @BeforeAll
  static void init() throws Exception {
    breadth = 1;
    height = 3;

    if (breadth <= 0 || height <= 0) {
      throw new Exception("Breadth and height must be positive");
    }
  }

  @Test
  void testAreaOfParallelogram() {
    assertTrue(breadth > 0);
    assertTrue(height > 0);
    int result = breadth * height;
    System.out.println("result " + result);
    assertTrue(result > 0);
  }
}
