package OOP;

import java.util.Scanner;

public class Employee {
    String name, department, position;
    int idNumber;

    Employee(String Name, int IdNumber,String Department, String Position) {
        name = Name;
        idNumber = IdNumber;
        department = Department;
        position = Position;

    }

    Employee () {}

    void display (){
        System.out.printf("|%25s|%5d|%17s|%18s|\n", name, idNumber, department,position);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter ID: ");
        idNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Position: ");
        position = sc.nextLine();
    }

    public static void main (String[] args){
        Employee s0 = new Employee("Nguyen Huu Thang", 001, "IT", "Programmer"); //khoi tao 1 doi tuong sv (opject)
        Employee s1 = new Employee();
        Employee s2 = new Employee();
        Employee s3 = new Employee();

        s1.display();
        s2.input();
        s3.input();
        System.out.println("|                     Name|   ID|       Department|        Position|");

        s1.display();
        s2.display();
        s3.display();


    }
}
