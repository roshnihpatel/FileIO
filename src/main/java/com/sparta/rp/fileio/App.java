package com.sparta.rp.fileio;


import com.sparta.rp.fileio.dao.EmployeeDAO;
import com.sparta.rp.fileio.dto.EmployeeDTO;

import java.io.*;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ){
        EmployeeDAO.PopulateArray("src/main/resources/EmployeeRecords.csv");

        System.out.println(EmployeeDAO.getEmployees().get(0).getFirstName());
    };
    }

