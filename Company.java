/*
Q3. Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have
data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary
to an employee and a manager by making an object of both of these classes and print the same.
 */

import java.util.Scanner;

class Member{
    String name,address;
    int age, salary;
    long phone_No;

    public Member(String name, String address, int age, int salary, long phone_No) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.phone_No = phone_No;
    }

    public void printSalary(){
        System.out.println("salary is :" + this.salary);
    }
}
class Employee extends Member{
    String spec;

    public Employee(String name, String address, int age, int salary, long phone_No, String spec) {
        super(name, address, age, salary, phone_No);
        this.spec = spec;
    }

    public void displaySpec(){
        System.out.println("specialization :"+ this.spec);
    }
}

class Manager extends Member{
    String dep;

    public Manager(String name, String address, int age, int salary, long phone_No, String dep) {
        super(name, address, age, salary, phone_No);
        this.dep = dep;
    }

    public void displayDepartment(){
        System.out.println("Department :"+ this.dep);
    }
}

public class Company {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager("Hanuman", "Ayodhya", 34, 1_00_000, 4567890, "Sales");
        m.printSalary();
        m.displayDepartment();
        Employee e = new Employee("krishna" , "mathura", 25, 60_000, 345675678, "aiml");
        e.printSalary();
        e.displaySpec();
    }

}
