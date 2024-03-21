/*   Write a java program to create linkedlist with employee objects, sort the all
             object based name of employee and salary of employee. 
              Note: take Employee as a class with id, name, designation and salary fields */

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Siri", "Pilot", 50000));
        employees.add(new Employee(2, "Kiran", "Teacher", 90000));
        employees.add(new Employee(3, "Susmitha", "Software", 100000));
        employees.add(new Employee(4, "Ram", "Docter", 80000));
        
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println("Sorted Employees by their names:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
        System.out.println(" Sorted Employees by their salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
