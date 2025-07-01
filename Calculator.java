// Project Calculator 01-07-2025

public class Calculator
{
    public void add()
    {
        int x = 1;
        int y = 2;
        int z = x+y;
        System.out.println(z);
    }

    public void subtract()
    {
        int x = 1;
        int y = 2;
        int z = y-x;
        System.out.println(z);
    }

    public void multiplication()
    {
        int x = 1;
        int y = 2;
        int z = x*y;
        System.out.println(z);
    }

    public void division()
    {
        int x = 1;
        int y = 2;
        int z = x/y;
        System.out.println(z);
    }
   public static void main(String[]args)
   {
       Calculator m= new Calculator();
       m.add();
       m.subtract();
       m.multiplication();
       m.division();
   }
}
