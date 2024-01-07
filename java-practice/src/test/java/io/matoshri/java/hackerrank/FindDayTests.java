package io.matoshri.java.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class FindDayTests {
  @Test
  void testFindDay() {
    String expected = "WEDNESDAY";
    Calendar calendar = Calendar.getInstance();
    calendar.set(2017, 8 - 1, 14);
    String displayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
    Assertions.assertEquals(expected, displayName);
    }
}
