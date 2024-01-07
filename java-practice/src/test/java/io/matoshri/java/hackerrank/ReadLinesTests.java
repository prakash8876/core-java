package io.matoshri.java.hackerrank;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.junit.jupiter.api.Test;

/*
 * Read lines of input and print with prefix of line number
 */
class ReadLinesTests {

  @Test
  void testReadLine() {
//    URL resource = ReadLinesTests.class.getClassLoader().getResource("readme.txt");
    URL resource = getClass().getClassLoader().getResource("readme.txt");
//    Path path = Paths.get("src/test/resources/readme.txt");
    Path path = null;
    try {
      path = Paths.get(resource.toURI());
      System.out.println("path " + path);
    } catch (URISyntaxException e) {
    }
    try (Scanner scanner = new Scanner(new FileReader(path.toFile()))) {
      int line = 0;
      while (scanner.hasNext()) {
        System.out.println(++line + " " + scanner.nextLine());
      }
      assertTrue(line > 0);
    } catch (FileNotFoundException e) {
      ExceptionUtils.getStackTrace(e);
    }
  }
}
