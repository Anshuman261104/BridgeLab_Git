import java.util.*;
public class Switching{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch(x){
            case 1:System.out.print(50000*30/100+50000);
                break;
            case 2:System.out.print(40000*25/100+40000);
                break;
            case 3:System.out.print(30000*20/100+30000);
                break;
            case 4:System.out.print(20000*15/100+20000);
                break;
        }
    }
}