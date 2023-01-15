
package mycalculation;
//this a simple program on inheritance and polymorphism
class Inheritance{
     int z;
 public void addition(int x, int y){
 z = x+y;
 System.out.println("The sum of the given numbers:"+z);
 }
 public void Substraction(int x,int y){
 z = x-y;
 System.out.println("The difference between the given numbers:"+z);
 }

}

public class MyInheritance extends Inheritance  {

    public void multiplication(int x, int y){
 z = x*y;
 System.out.println("The product of the given numbers:"+z);
    }
    public static void main(String[] args) {
        int a = 20, b = 10;
 MyInheritance mc = new MyInheritance();
mc.addition(a, b);
 mc.Substraction(a, b);
 mc.multiplication(a, b); 
        
    }
    
}
