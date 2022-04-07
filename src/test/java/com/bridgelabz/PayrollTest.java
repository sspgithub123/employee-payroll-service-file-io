package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@SuppressWarnings("deprecation")
public class PayrollTest {
    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeesEntries() {
        EmployeePayrollData[] arrayOfEmps = { new EmployeePayrollData(1, 25000.56, "Devnandan Kumar"),
                new EmployeePayrollData(2, 15000.65, "Manoj Kumar"),
                new EmployeePayrollData(3, 22000.67, "Abhishek sinha") };
        EmployeePayrollService payrollService;
        payrollService = new  EmployeePayrollService(Arrays.asList(arrayOfEmps));
        payrollService.write(IOService.FILE_IO);
        long entriesCount=payrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assertions.assertEquals(3, entriesCount);
    }

}