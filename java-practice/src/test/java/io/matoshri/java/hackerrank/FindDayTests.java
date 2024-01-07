package io.matoshri.java.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class FindDayTests {
    @Test
    void testFindDay() {
        String expected = "";
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 8, 14);
        String day = String.valueOf(calendar.get(Calendar.DAY_OF_WEEK));
    }
}
