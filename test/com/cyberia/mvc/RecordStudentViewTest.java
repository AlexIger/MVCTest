package com.cyberia.mvc;

import org.junit.jupiter.api.Test;

class RecordStudentViewTest
{

    @Test
    void test_printStudentDetails()
    {


        View view = new View();

        view.printStudentDetails("Anna", "1200");

    }
}