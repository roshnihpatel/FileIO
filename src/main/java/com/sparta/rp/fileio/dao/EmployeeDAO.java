package com.sparta.rp.fileio.dao;

import com.sparta.rp.fileio.dto.EmployeeDTO;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Data access object
public class EmployeeDAO {
    private static ArrayList<EmployeeDTO> employees = new ArrayList<>();
    private static BufferedReader bufferedReader;


    public static ArrayList<EmployeeDTO> getEmployees(){
        return employees;
    };


    public static void PopulateArray(String fileName){
        try {
            var fileReader = new FileReader("src/main/resources/EmployeeRecords.csv");
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line = bufferedReader.readLine();

            //System.out.println(firstLine);
            while (line != null) {
                String[] records = line.split(",");
                EmployeeDTO employeeDTO = new EmployeeDTO(records);
                employees.add(employeeDTO);
                line = bufferedReader.readLine();

            }

        }catch(IOException e){
            e.printStackTrace();
        }


        }
    }

