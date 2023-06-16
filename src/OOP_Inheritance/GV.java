package OOP_Inheritance;

import java.util.Scanner;

public class GV extends PS{
    String hv;
    GV(){}
    GV(String ID, String Name, String hv)
    {
        super(ID, Name);
        this.hv =hv;
    }
    void display()
    {
        super.display();
        System.out.print(hv);
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Enter hoc vi:");
        hv = sc.nextLine();
    }
}
