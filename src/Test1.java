import java.util.Scanner;

public class Test1 {
    public static void Test1_main() {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        int age;
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Hello " + name + " " + age + " tuoi");
    }
}
