package com.bridgelabz;

/**
 * import classes
 */

import java.io.*;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

/**
 * create a class name as EmployeePayrollFileIOService
 */
public class EmployeePayrollFileIOService {
    public static String PAYROLL_FILE_NAME =( "C:\\Users\\lenovo\\IdeaProjects\\employee-payroll-service-file-io" +
            "\\src\\main\\java\\com\\bridgelabz");

    /**
     * create a method name as  writeData
     * @param employeePayrollList all data save
     */
    public void writeData(List<EmployeePayrollData> employeePayrollList) {
        /**
         * create a object name as employeeBuffer
         */
        StringBuffer employeeBuffer = new StringBuffer();
        employeePayrollList.forEach(employee -> {
            String employeeDataString = employee.toString().concat("\n");
            employeeBuffer.append(employeeDataString);
        });
        /**
         * using try cathch for exception handling
         */
        try {
            Files.write(Paths.get(PAYROLL_FILE_NAME), employeeBuffer.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * create a method name as countEntries
     * @param employeePayrollList all data store in this
     * @return enteries
     */
    public long countEntries(List<EmployeePayrollData> employeePayrollList) {
        long entries = 0;
        try {
            entries = Files.lines(new File(PAYROLL_FILE_NAME).toPath()).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return entries;
    }
}
