import java.util.Scanner;
//public class firstprogram
//{
//public static void main(String[] args)
//{
//System.out.println("Hello World");
//System.out.println(args[0]);
//System.out.println(args[1]);
//for(int i=0;i<=args.length-1;i++){
	//System.out.print(args[i]);
//}
//}
//}

public class firstProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("Addition of a is " + a + " and b is " + b + " → result is " + sum);

        int diff = a - b;
        System.out.println("Subtraction of a is " + a + " and b is " + b + " → result is " + diff);

        int prod = a * b;
        System.out.println("Multiplication of a is " + a + " and b is " + b + " → result is " + prod);

        if (b != 0) {
            int div = a / b;
            System.out.println("Division of a is " + a + " and b is " + b + " → result is " + div);
        } else {
            System.out.println("Division not possible as b is 0");
        }

        if (b != 0) {
            int mod = a % b;
            System.out.println("Modulo (a % b) of a is " + a + " and b is " + b + " → result is " + mod);
        } else {
            System.out.println("Modulo not possible as b is 0");
        }

        int aPostInc = a++;
        int bPostDec = b--;

        System.out.println("Post-increment of a (original a was " + aPostInc + ") → new value is " + a);
        System.out.println("Post-decrement of b (original b was " + bPostDec + ") → new value is " + b);

        sc.close();
    }
}