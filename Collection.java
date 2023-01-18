/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collaection;

/**
 *
 * @author Windows 10 Pro
 */
import java.util.*;
public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List l1=new ArrayList();
        l1.add("kuma");
        l1.add("leta");
        l1.add("keba");
        System.out.println("the array elements are");
        System.out.println(l1);
        List l2=new LinkedList();
        l2.add("student ");
        l2.add("teacher");
        l2.add("director");
        System.out.println("the data you added to a linked list");
        System.out.println(l2);
        Set s1=new HashSet();
        s1.add("university");
        s1.add("college");
        s1.add("highschool");
        System.out.println("the data elemmentes that you have enterd into set");
        System.out.println(s1);
        Map m=new HashMap();
        m.put("c++",3);
        m.put("c#",4);
        m.put("php", 5);
        m.put("java script", 1);
        m.put("java", 10);
        m.put("python", 7);
      
        System.out.println("the map elements and their corresponding value are listed below");
        System.out.println(m);
    }
    
}
