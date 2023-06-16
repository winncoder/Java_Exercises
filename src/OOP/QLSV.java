package OOP;

import java.util.Scanner;

public class QLSV { //khai bao class
        String id, name;   //khai bao thuoc tinh (attributes)
        int age;
    QLSV(String ID, String Name, int Age){ //Ham khoi tao doi tuong (ham dungwj) = Constructor, Ham dung k co kieu du lieu tra ve (Name,Id = tham so)
        id = ID;
        name = Name;
        age = Age;
    }
    void display(){
        System.out.printf("%10s|%20s|%d\n", id, name, age);
    }
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
    }
    QLSV () {} //Ham khoi tao mac dinh de tao 1 doi tuong rong
    public static void main (String[] args){
        QLSV s1 = new QLSV("GCD201443","Nguyen Huu Thang", 20); //khoi tao 1 doi tuong sv (opject)
        QLSV s2 = new QLSV("GCD201999", "Thang dep trai", 19); //Cach 2
        QLSV s3 = new QLSV();
        s3.input();
        System.out.println("        ID|                Name|Age");

        s1.display();
        s2.display();
        s3.display();


    }
}
