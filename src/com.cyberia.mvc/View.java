package com.cyberia.mvc;

import java.util.logging.Logger;

// the view

public class View implements ViewInterface
{
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    private final static Logger log = Logger.getLogger("Any");

    /**
     *
     */
    public View() {
        super();
    }

    @Override
    public void printStudentDetails(String studentName, String studentRollNo)
    {
        log.info ("Student: " + "Name:: " + studentName +
                '\n' + "Roll No:: " + studentRollNo + '\n');
    }


}