package com.cyberia.mvc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DAOStubTest
{

    @Test
    void test_getStudent()
    {
        RecordStudent student = Model.getStudent();

        String name  = student.getName();
        String roll = student.getRollNo();

        assertEquals("Robert", name);
        assertEquals("10", roll);
        assertTrue("10".equals(roll));
        assertNotNull(name);
    }
}