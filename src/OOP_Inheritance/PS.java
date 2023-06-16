package OOP_Inheritance;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PS  {
    String id;
    String name;

    PS(){}

    public PS(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void display(){
       System.out.println(id + "\t"+ name + "\t");
   }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        id  = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
}
}

