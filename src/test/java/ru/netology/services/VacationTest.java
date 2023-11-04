package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")
    public void testCashVacationSrc(int expected, int income, int expenses, int threshold) {
        Vacation service = new Vacation();
        //int expected = 3;
        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        int actual = service.calcBonus(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    public void testCashVacationLong() {
        Vacation service = new Vacation();
        int expected = 3;
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int actual = service.calcBonus(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testCashVacationShort() {
        Vacation service = new Vacation();
        int expected = 2;
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int actual = service.calcBonus(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }*/
}
