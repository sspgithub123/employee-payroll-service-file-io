package com.bridgelabz;

/**
 *  UC1 :- Create an Employee Payroll Service to Read and Write Employee Payroll to a Console
 *         - Create Employee Payroll Class of id, name and Salary
 *         - Read the information from the console
 *         - Finally write the employee payroll to the console
 *  UC2 :- Write a program to demonstrate File Operations like
 *         - Check File Exists
 *         - Delete File and Check File Not Exist
 *         - Create Directory
 *         - Create Empty File
 *         - List Files, Directories as well as Files with Extension
 *  UC3 :- Create a Watch Service to watch particular directory along with all Files and Sub Directories
 *         - Using File IO Count Number of Entries in the File
 *  UC4 :- Create an Employee Payroll Service to store Employee Payroll into a File
 *         - Create Employee Payroll Class of id, name and Salary
 *         - Populate Test Employee Payroll Object
 *         - Write Employee Payroll to File Use File IO
 *         - Count Number of Entries to ensure the Operation worked
 *  UC5 :- Ability for Employee Payroll Service to printPayroll Service to print the Employee Payrolls
 *         - Using File IO print the lines in the Payroll File
 *         - Count Number of Entries to ensure the Operation  worked
 *  UC6 :- Ability for Employee Payroll Service to read the Employee Payroll File so that some analysis can be performed
 *         - Using File IO read the file
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
     * create enum class name as IOService
     */
    public enum IOService{
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO;
    }
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
    void write(IOService ioService) {
        if(ioService.equals(ioService.CONSOLE_IO))
        /**
         * display the employee data in store in employeePayrollList
         */
            System.out.println("Given Employee Data is : " + employeePayrollList);
        else if(ioService.equals(ioService.FILE_IO))
            new EmployeePayrollFileIOService().writeData(employeePayrollList);
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
     * create a method name as countEntries
     * Counting total number of entries into the payroll list
     * @param fileIo
     * @return employeepayrolllist
     */
    public long countEntries(IOService fileIo) {
        return new EmployeePayrollFileIOService().countEntries(employeePayrollList);
    }

    /**
     * create a method name as printData
     * Printing all the entries of PayrollList
     * @param fileIo print data in file io
     */
    public void printData(IOService fileIo) {
        if (fileIo.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData((employeePayrollList));
    }

    /**
     * Reading the employee payroll list so that we can do any operation
     * @param fileIo read d deta in file io
     * @return list of operation
     */
    public long readEmployeeData(IOService fileIo) {
        List<String> list=new ArrayList<>();
        if (fileIo.equals(IOService.FILE_IO))
            list = new EmployeePayrollFileIOService().readData();
        return list.size();
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
        employeePayrollService.write(IOService.CONSOLE_IO);
    }
}