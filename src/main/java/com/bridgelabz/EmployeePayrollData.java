package com.bridgelabz;

public class EmployeePayrollData {
    /**
     * private variables can only be accessed within the same class (an outside class has no access to it)
     * private = restricted access
     * However, it is possible to access them if we provide public get and set methods.
     */

    // variables
    private int id;
    private double salary;
    private String name;

    /**
     * create a parameterized constructor name as EmployeePayrollData
     * @param id employee id
     * @param salary employee salary
     * @param name employee name
     */
    public EmployeePayrollData(int id, double salary, String name) {
        /**
         *  The "this" keyword is used to refer to the current object.
         */
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    /**
     * create a default constructor
     */
    public EmployeePayrollData() {
    }

    /**
     * Used getter and setter to set and get the value.
     * Setter is used to set the value
     * Getter is used to get the value
     */

    /**
     * crete a get method name as getId
     * The getId method returns the value of the variable
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * The setId method takes a parameter (id) and assigns it to the id variable
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * crete a get method name as getSalary
     * The getSalary method returns the value of the variable
     * @return  salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * The setSalary method takes a parameter (salary) and assigns it to the salary variable
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * crete a get method name as getName
     * The getName method returns the value of the variable
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * The setName method takes a parameter (name) and assigns it to the name variable
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * overriding the toString() method
     * @return employee id ,salary, and name.
     */
    @Override
    public String toString() {
        return "EmployeePayrollData [id=" + id + ", salary=" + salary + ", name=" + name + "]";
    }

}
