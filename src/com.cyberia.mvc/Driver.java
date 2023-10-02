package com.cyberia.mvc;

// Changed

public class Driver
{

    public static void main(String[] args)
    {
        Controller controller = new Controller(Model.getStudent(), new View());

        controller.setStudentName("John");
        controller.setStudentRollNo("20");
        controller.updateView();

        // update model data
        controller.setStudentName("Ann");
        controller.setStudentRollNo("28");
        controller.updateView();
    }

    public int getAge(int age)
    {
        return 100 + age;
    }
}
