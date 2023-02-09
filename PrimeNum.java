import java.util.Scanner;
 class PrimeNum {
    public static void main(String []args)
    {
        int n,f;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            f=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
                if(f==0)
                System.out.println(" "+i);
            }


        }
    }
}
