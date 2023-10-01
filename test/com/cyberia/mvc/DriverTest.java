package com.cyberia.mvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

// for assertions on Java 8 types (Streams and java.util.Optional)
import static com.google.common.truth.Truth8.assertThat;

class DriverTest {

    @Test
    void test_getAge_return_int()
    {
        Driver driver  = new Driver();

        String num = "110";
       assertEquals(110, driver.getAge(10));

        assertThat(num).contains("10");


    }
}