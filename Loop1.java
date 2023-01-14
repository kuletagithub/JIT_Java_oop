/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;

/**
 *
 * @author Windows 10 Pro
 */
public class Loop1 {

    public static void main(String[] args) {
        // TODO code application logic here
         int x=10;
        System.out.println("this a while loop which prints the value starting from 10 till 19");
 while( x < 20 ) {
 System.out.println("value of x : " + x );
 x++;
 
 }
    
        System.out.println("this is a for loop which prints a value value starting from 10 till 19");
        forl();
        
        System.out.println("this is a do while loop which prints a value starting from 10 till 19");
        doWhile();
    }
    public static void forl(){
for(int i=10 ;i<20;i++ ) {
 System.out.println("value of i : " + i);
 

}
}
       public static void doWhile(){
           int j=10;
      do{
          System.out.println("value of x:"+j);
          j++;
}while(j<20);
    }
}

    

