package com.utils;

import com.employees.Employee;

public class Utils {

    private static void displayEmployeeDetails(Employee employee){

        // Getting the employee details
        int employeeId = employee.getEmployeeId();
        String employeeNumber = employee.getEmployeeNumber();
        String employeeName = employee.getName();
        String employeeDep = employee.getDepartment();

        // Printing out the employee details
        System.out.println("EmployeeID - " + employeeId + " employeeNumber - " + employeeNumber + " employeeName - " + employeeName + " employeeDepartment - " + employeeDep);
    }

}
