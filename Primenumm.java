import java.util.Scanner;
    public class Primenumm 
    {
        public static void main(String[] args)
        {    int n,i=2,c=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter any number");
            n=sc.nextInt();
            int j=n/2;
            while(i<=j)
            {
                if(j%2==0)
                {
                    c+=1;
                    break;
                }
                i++;
            }
            if(c==0)
                System.out.println("prime number");
            else
                System.out.println("not prime number");
        }
    }
    
    
    
    
    
    
    
    

