/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author Windows 10 Pro
 */
public class MethodOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 11;
 int b = 6;
 double c = 7.3;
 double d = 9.4;
 MethodOverloading mo=new MethodOverloading();
 int result1=mo.minFunction(a, b);
 double result2 = mo.minFunction(c, d);

System.out.println("Minimum Value = " + result1);
 System.out.println("Minimum Value = " + result2);



    }
    public  int minFunction(int n1, int n2) {
 int min;
 if (n1 > n2)
 min = n2;
 else
     min = n1;
 return min;
 }
    public double minFunction(double n1, double n2) {
 double min;
 if (n1 > n2)
 min = n2;
 else
 min = n1;
 return min;
 }

    
}
