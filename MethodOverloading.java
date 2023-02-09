 class MethodOverloading {
   void show()//default arguments
     {
         System.out.println("1");
     }
     void show(int x)//parameterized arg
     {
         System.out.println("2");
     }
     public static void main(String []args)
     {
         MethodOverloading m=new MethodOverloading();
         m.show();
         m.show(5);
     }
    
}
