import java.lang.ArithmeticException;
class Error {
    public static void main(String []args)throws ArithmeticException
    {
    int a=10;
    int b=5;
    int c=5;
    int x=a/(b-c);
    System.out.println("x= "+x);
    }
}
