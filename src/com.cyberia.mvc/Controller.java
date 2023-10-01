package com.cyberia.mvc;
// the controller
//this is main
public class Controller
{
    private final RecordStudent model;
    private final View view;

    public Controller(RecordStudent model, View view)
    {
        this.model = model;
        this.view = view;

        // commit message
    }

    public void setStudentName(String name)
    {
        model.setName(name);
    }

    public void setStudentRollNo(String rollNo)
    {
        model.setRollNo(rollNo);
    }

    public void updateView()
    {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}

