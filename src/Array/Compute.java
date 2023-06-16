package Array;

import java.util.Scanner;

//Compute the average even elements
public class Compute {
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
        int average = 0;
        for (int i = 0; i < size; i++)
        {

            if (array[i]%2 == 0)
            {
                average = average + array[i];
            }
        }
        System.out.println("Average even elements: " + average);

    }
}
