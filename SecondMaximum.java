/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondmaximum;

/**
 *
 * @author Windows 10 Pro
 */
public class SecondMaximum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int num[] = {2, 4, 5, 12, 12, 21, 8};
        int n = num.length;
        //Arrays.sort(num);//sort thee array
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (num[i] > highest) {
                secondHighest = highest;
                highest = num[i];
            }

            if (num[i] < highest && num[i] > secondHighest) {
                secondHighest = num[i];
            }
        }
        //System.out.println("second highest number is:" +num[n-2]);
        System.out.println("second highest number is:" + secondHighest);

    }
    
}
