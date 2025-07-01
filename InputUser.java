import java.util.Scanner;
public class InputUser
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.print("Result is : ");
        int result = a + b;

        System.out.println(result);
//      String input = sc.nextLine(); // for storing value in string.
//        int input = sc.nextInt(); // for storing value in integer.

    }
}
