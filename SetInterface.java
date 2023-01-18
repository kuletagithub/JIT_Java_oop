/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setinterface;
import java.util.*;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;

/**
 *
 * @author Windows 10 Pro
 */
public class SetInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array={10,1,9,8,5};
        try{
            Set<Integer> set=new HashSet<Integer>();
            for(int i=0;i<array.length;i++){
                set.add(array[i]);
                
            }
            //the following code will check whther an object  with in our collection list
            System.out.println(set.contains(1));
            System.out.println(set.contains(10));
            System.out.println(set.contains(8));
            System.out.println(set.contains(9));
            System.out.println(set.contains(5));
            System.out.println("the data elements after inserted in to set is ");
            System.out.println(set);    
            TreeSet sort=new TreeSet<Integer>(set);
            System.out.println("the value in treeset after being sorted");
            System.out.println(set);
            System.out.println("to get the sorted first element of collection: "+(Integer)sort.first());
            System.out.println("to get the the last elment from sorted collection: "+(Integer)sort.last());
            //this will check whether our collection is empty
            System.out.println(set.isEmpty());
            //this will return the size of our collections
            System.out.println(" the size of our collection: "+set.size());
           
        }
        catch(Exception e){
            
        }
    }
    
    
}
