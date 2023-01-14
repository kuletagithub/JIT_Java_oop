/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse;

import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
        System.out.print("please enter the number you want to reverse:");
       int rev=sc.nextInt();
        System.out.println("");
        System.out.println("the digit you inserted is "+rev);
        int lastdigit,reversed=0;
        while(rev!=0){
        lastdigit=rev%10;
        reversed=reversed*10+lastdigit;
        rev=rev/10;

        }
             
        System.out.println("the digits after reversed :"+reversed);
    }
    
}
