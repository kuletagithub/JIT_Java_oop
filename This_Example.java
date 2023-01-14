/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this_example;

//Instance variable num
 
public class This_Example {
    int num=10;
    This_Example(){
 System.out.println("This is an example program on keyword this ");
    }
     This_Example(int num){
 //Invoking the default constructor

    this();
 
 //Assigning the local variable num to the instance variable num
 this.num=num; 
 }
    public void wellcome(){
 System.out.println("Hi Welcome to java course");
 }

public void print(){
 //Local variable num
 int num=20;
 
 //Printing the instance variable
 System.out.println("value of local variable num is : "+num);
 
 //Printing the local variable
 System.out.println("value of instance variable num is : "+this.num);
 
 //Invoking the greet method of a class
 this.wellcome(); 
 }

    public static void main(String[] args) {
        // TODO code application logic here
//Instantiating the class
 This_Example obj1=new This_Example();
 
 //Invoking the print method
 obj1.print();
 
 //Passing a new value to the num variable through parametrized constructor
 This_Example obj2=new This_Example(30);
 
 //Invoking the print method again
 obj2.print();
    }
    
}
