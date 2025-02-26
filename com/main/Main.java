package com.main;

import com.employees.Employee;
import com.utils.Utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception{

        // Creating a new employee using reflection
        Class employeeClass = Class.forName("com.employees.Employee");
        Constructor employeeConstructor = employeeClass.getDeclaredConstructor(int.class, String.class);
        Object employeeObject = employeeConstructor.newInstance(2, "M23876");
        System.out.println(employeeObject);
        // Employee employee = new Employee();
        Method id = employeeClass.getDeclaredMethod("setEmployeeId", int.class);
        id.setAccessible(true);
        id.invoke(employeeObject, 1);
        Method num = employeeClass.getDeclaredMethod("setEmployeeNumber", String.class);
        num.setAccessible(true);
        num.invoke(employeeObject, "M2786");
        Method name = employeeClass.getDeclaredMethod("setName", String.class);
        name.setAccessible(true);
        name.invoke(employeeObject, "Ben");
        Method dep = employeeClass.getDeclaredMethod("setDepartment", String.class);
        dep.setAccessible(true);
        dep.invoke(employeeObject, "Software");

        Field[] fields = employeeClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + " " + field.get(employeeObject));
        }
        // Creating new employee
        Object employeeObject2 = employeeConstructor.newInstance(2, "M23876");
        // Displaying employee details with reflection
        Utils utils = new Utils();

        Method display = utils.getClass().getDeclaredMethod("displayEmployeeDetails", Employee.class);
        display.setAccessible(true);
        display.invoke(null, employeeObject);
        display.invoke(null, employeeObject2);

    }
}