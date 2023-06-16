package Array;

import java.io.Console;
import java.util.Scanner;
//Input/output the array
public class Input_Output {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
