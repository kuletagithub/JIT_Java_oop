/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysc;


public class ArraysC {

    
    public static void main(String[] args) {
        //creation of arrays
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        //displaying array elements using for loop
        for (int i = 0; i < myList.length; i++) {
 System.out.println(myList[i] + " ");
 }
 // Summing all elements
 double total = 0;
 for (int i = 0; i < myList.length; i++) {
 total += myList[i];
 }
 System.out.println("Total is " + total);
 //passing arrays as a parametres
 int []arrays={3, 1, 2, 6, 4, 2};
//reverse(new int[]{3, 1, 2, 6, 4, 2});
arrays=reverse(arrays);
        System.out.println("the array elements after being reversed");
for(int i=0;i<arrays.length;i++)
            System.out.println(arrays[i]);


    }
   public static int[] reverse(int[] list) {
       //this an array methods that returns a values
 int[] result = new int[list.length];
 for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
 result[j] = list[i];
 }
 return result;
}
    
}
