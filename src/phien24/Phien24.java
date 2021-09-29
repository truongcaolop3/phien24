/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien24;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d,e;
        int x;
        double y;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập 5 số nguyên ");
        a = sc.nextInt();
        b= sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        x = a + b + c + d + e ;
        y = x/5;
        
        System.out.println("The sum of 5 no is: " + x);
        System.out.println("The Average is: " + y);
    }
    
}
