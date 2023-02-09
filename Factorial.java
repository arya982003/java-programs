import java.util.*;
public class Factorial {
    static int fact(int n)
    {
        if(n==0)
         return 1;
        else
          return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n=sc.nextInt();
        System.out.println(""+fact(n));
    }
}
