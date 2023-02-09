class ExtendingThread extends Thread{
    void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("Thread A"+i);
    }
}
class B extends Thread{
    void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("Thread B"+i);
    }
}
class Example
{
    public static void main(String[] args) {
        ExtendingThread a=new ExtendingThread();
        B b=new B();
        a.start();
        b.start();
    }
}