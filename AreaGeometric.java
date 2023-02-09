import java.util.Scanner;
class AreaGeometric {
 void calculate(float x)
 {
     System.out.println("Area of square= "+x*x);
 }   
 void calculate(float x,float y)
 {
     System.out.println("Area of rectangle= "+x*y);
 }
 void calculate(double x)
 {
     double area=3.14*x*x;
     System.out.println("Area of circle= "+area);
 }

public static void main(String []args)
{AreaGeometric a=new AreaGeometric();
    a.calculate(6.1f);
    a.calculate(10,20);
    a.calculate(6.1);
}
}
