// 04-07-2025 //

import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number u want to check");
        int number = sc.nextInt();
        int count = 0;
        for(int i = 1; i<=number; i++)
        {
            if(number % i == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            System.out.println(number + " is a Prime number.");
        }
        else
        {
            System.out.println(number + " is Not a prime number,");
        }
    }
}
