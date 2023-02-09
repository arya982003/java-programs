//run method overriding
class Test {
  void show()
  {
   System.out.println("1");
  }
}
class Temp extends Test{
    void show()
    {
       // super.show();
        System.out.println("5");
        super.show();
    }
    public static void main(String[]args)
    {
        Temp t=new Temp();
        t.show();
       // Test s=new Test();
        //s.show();
    }
}
