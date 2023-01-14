/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creatingobject;

public class CreatingObject {
public CreatingObject(String name) {
    System.out.println("Passed Name is :" + name );
}
   
    public static void main(String[] args) {
        
     // Following statement would create an object myPuppy


       CreatingObject co=new CreatingObject("kuma"); 
    }
    
}
