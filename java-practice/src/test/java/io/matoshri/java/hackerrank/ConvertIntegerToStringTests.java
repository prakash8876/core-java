package io.matoshri.java.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConvertIntegerToStringTests {
    @Test
    void testConvertToString() {
        int n = 324;
        String s = String.valueOf(n);
        Assertions.assertEquals(n, Integer.valueOf(s));
    }
}
