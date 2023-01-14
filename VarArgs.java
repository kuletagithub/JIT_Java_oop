/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author Windows 10 Pro
 */
public class VarArgs {

    /**
     * @param args the command line arguments
     */
    public static void display(int...args){
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        display(1,2,3,4,5);
    }
    
    
}
