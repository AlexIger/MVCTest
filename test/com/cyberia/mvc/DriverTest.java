package com.cyberia.mvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void test_getAge_return_int()
    {
        Driver driver  = new Driver();

       assertEquals(110, driver.getAge(10));

    }
}