package com.cyberia.mvc;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class RecordStudentControllerTest
{
    @Test
    void test_updateView()
    {
        RecordStudent model;
        int y = 0;

        for (int i = 0; i < 2; i++)
        {
            if (y == 0)
            {
                //stub with mockito
                model = Mockito.mock(RecordStudent.class);
                when(model.getName()).thenReturn("Anna");
                when(model.getRollNo()).thenReturn("10");
            } else
            {
                //stub manually
                model = Model.getStudent();
            }
            View view = new View();
            Controller controller = new Controller(model, view);
            controller.updateView();

            //change the state of the loop
            y++;
        }
    }
}