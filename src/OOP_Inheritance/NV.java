package OOP_Inheritance;

import javax.naming.Name;
import java.util.Scanner;

public class NV extends PS {
    String job;

    NV(){}


    public NV(String id, String name, String job) {
        super(id, name);
        this.job = job;
    }

    public String getJob() {
        return job  ;
    }

    public void setJob(String job) {
        this.job = job;
    }

    void display(){
        super.display();
        System.out.print(job);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("Enter job: ");
        job = sc.nextLine();
    }
}
