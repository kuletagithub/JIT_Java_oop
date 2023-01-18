/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortedset;
import java.util.*;

/**
 *
 * @author Windows 10 Pro
 */
public class SortedSetint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      SortedSet sort=new  TreeSet();
      sort.add("c");
      sort.add("z");
      sort.add("f");
        System.out.println("the collection after being ordered: "+sort);
        sort.add("kuma");
        sort.add("leta");
        sort.add("keba");
         System.out.println(sort);
         //iterating over an elments
         Iterator it=new sort.iterator();
         while(it.hasNext()){
             Object element=it.next();
             System.out.println(element.toString());
         }
        
    }
    
}
