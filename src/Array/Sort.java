package Array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Sort elements ascending / descending
public class Sort {
    public static void main(String[] args)
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

        Arrays.sort(array);
        System.out.println("\n Sort elements ascending: ");
        for (int i = 0; i < size; i++)
        {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n Sort elements descending: ");
        for (int i = size-1; i >= 0; i--)
        {
            System.out.print(array[i] + " ");
        }
    }
}
