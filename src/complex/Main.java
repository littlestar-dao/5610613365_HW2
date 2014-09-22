/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complex;

import java.util.Scanner;

/**
 *
 * @author Windows 7
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter complex number1 : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        System.out.print("Enter complex number2 : ");
        int c = scan.nextInt();
        int d = scan.nextInt();
        
        Complex e = new Complex (a,b);
        Complex f = new Complex (c,d);

        Complex g = e.add(f); // new Complex (real,imag);
        System.out.print("add: ");
        System.out.println(e + " + " + f + "=" + g);
        
        Complex h = e.substract(f);
        System.out.print("substract: ");
        System.out.println(e + " - " + f + "=" + h);
        
        Complex i = e.mul(f);
        System.out.print("Multiplication: ");
        System.out.println(e + " * " + f + "=" + i);
        System.out.println("Real part of complex number 1 is : " +e.getReal());
        System.out.println("Imaginary part of complex number 1 is : " +f.getImagination());
       
        double j = Complex.magnit(e);
        System.out.println("Magnitude is : " + j);
        
        System.out.println(e.Compare(f));
    }
}
    