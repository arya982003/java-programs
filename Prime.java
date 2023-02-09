import java.util.*;
public class Prime {
    public static void main(String[] args)
    {
        int n,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("prime number");
        }
        else
        {
            System.out.println(" not prime number");
        }
       
    }
}
