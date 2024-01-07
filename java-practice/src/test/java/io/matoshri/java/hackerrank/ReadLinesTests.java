package io.matoshri.java.hackerrank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

/*
 * Read lines of input and print with prefix of line number
 */
class ReadLinesTests {

  @Test
  void testReadLine() {
    Path path = Paths.get("src/test/resources/readme.txt");
    try (Scanner scanner = new Scanner(new FileReader(path.toFile()))) {
      int line = 0;
      while (scanner.hasNext()) {
        System.out.println(++line + " " + scanner.nextLine());
      }
      assertTrue(line > 0);
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
