package Array;

import java.util.Scanner;
//Count number of odd elements

public class Count {
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
        int index = 0;
        System.out.print("Number of odd elements: ");
        for (int i = 0; i < size; i++)
        {

            if (array[i]%2 == 1)
            {
                index= index + 1;
            }
        }
        System.out.print(index);
    }
}
