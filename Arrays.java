/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author Windows 10 Pro
 //*///import java.util.Arrays;
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]array=new int[5];
       Scanner sc=new Scanner(System.in);
        System.out.println("please enter value of array");
        for(int i=0;i<array.length;i++)
            array[i]=sc.nextInt();
        System.out.println("the value you entered is");
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
        Arrays aobj=new Arrays();
        int[] secarray;
        aobj.printarray(new int[]{1,2,3,4,5});
       // aobj.printarray(array,array.length);
       // System.out.println("the maximum value you entered afte");
       // int max=array[0];
     //   int[] secarray=new int[array.length];
        //for(int i=1;i<array.length;i++){
           // if(array[i]>max)
            //    max=array[i];
        }
        void printarray(int[] arr){
        for(int i=0;i<arr.length;i++ )
        System.out.println(arr[i]);
    }
    
    
}
