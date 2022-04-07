package com.bridgelabz;

/**
 *  UC1 :- Create an Employee Payroll Service to Read and Write Employee Payroll to a Console
 *         - Create Employee Payroll Class of id, name and Salary
 *         - Read the information from the console
 *         - Finally write the employee payroll to the console
 */

/**
 * import arraylist class
 * import list class
 * import scanner clas
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * creating class name as  EmployeePayrollService
 */
public class EmployeePayrollService {
    /**
     * create list
     */
    private List<EmployeePayrollData> employeePayrollList;

    /**
     * create a default constructor
     */
    public EmployeePayrollService() {

    }

    /**
     *  create a parameterized Constructor name as EmployeePayrollService
     * @param employeePayrollList in all data stored about employee
     */
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.employeePayrollList = employeePayrollList;
    }

    /**
     * create a method name as write
     * Method to print data back to console
     */
    private void write() {
        /**
         * display the employee data in store in employeePayrollList
         */
        System.out.println("Given Employee Data is : " + employeePayrollList);
    }

    /**
     * create a method name as readEmployeeData
     * Method to take data from console
     * @param SC taking user i/p
     */
    private void readEmployeeData(Scanner SC) {
        /**
         * enter 1st name employee
         */
        System.out.println("Enter your name : ");
        String name = SC.nextLine();
        /**
         * enter employee id for ex- 1 or 2 like that
         */
        System.out.println("Enter your ID : ");
        int id = SC.nextInt();
        /**
         * enter employee salary ,For ex - 5000 like that
         */
        System.out.println("Enter your salary : ");
        double salary = SC.nextDouble();
        /**
         * create object for  EmployeePayrollData class and object name is empData
         */
        EmployeePayrollData empData = new EmployeePayrollData(id, salary, name);
        /**
         * add the all data to employeePayrollList in empData
         */
        employeePayrollList.add(empData);
    }

    /**
     *  create a main method, all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {
        /**
         * create a scanner class object
         */
        Scanner SC = new Scanner(System.in);
        /**
         * create arraylist ,crete a object name as employeePayrollList
         */
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();

        /**
         * crete object name as employeePayrollService
         */
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        /**
         * calling readEmployeeData method from object name as employeePayrollService
         */
        employeePayrollService.readEmployeeData(SC);
        /**
         * calling write method from object name as employeePayrollService
         */
        employeePayrollService.write();

    }
}
