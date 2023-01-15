/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package override;

/**
 *
 * @author Windows 10 Pro
 */
class Overrided{
     int num = 20;
 
 //display method of superclass
 public void display(){ 
 System.out.println("This is the display method of Overrided");
}
}
public class Override extends Overrided {
int num = 10;
 
 //display method of sub class
 public void display(){
 System.out.println("This is the display method of Override");

 
 

    }
    


public void my_method(){
 
 //Instantiating subclass
 Override OVD = new Override();
 
 //Invoking the display() method of sub class
 OVD.display();
 
 //Invoking the display() method of superclass
 super.display();
 
 //printing the value of variable num of subclass
 System.out.println("value of the variable named num in Override:"+OVD.num);
 
 //printing the value of variable num of superclass
 System.out.println("value of the variable named num in OVERRIDED:"+
super.num); 
 
 
 }
public static void main(String args[]){
 Override obj = new Override();
 obj.my_method();
}
}


