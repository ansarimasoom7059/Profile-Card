/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.ArrayList;
import java.util.List;

class Employee {
    
    private int id;
    private String name;
    private double salary;

    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: Rs" + salary);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Saurabh", 50000));
        employees.add(new Employee(102, "Sakil", 60000));
        employees.add(new Employee(103, "Pawan", 55000));

        System.out.println("Employee Details:");
        System.out.println("==========================");
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}

