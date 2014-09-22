/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package complex;


/**
 *
 * @author Windows 7
 */
public class Complex {
    private int x;
    private int y;
    public Complex ()
    {
        x = 0;
        y = 0;
    }
    public Complex (int initx, int inity)
    {
        x = initx;
        y = inity;
    }
    public int getReal ()
    {
        return x;
    }
    public int getImagination ()
    {
        return y;
    }
    public Complex add (Complex dao)
    {
        int real = x + dao.getReal();
        int imag = y + dao.getImagination();
        return new Complex (real , imag);
    }
    public Complex add(int dao){
        int real = x + dao;
        int imag = y + 0;
        return new Complex(real,imag);
    }
    public Complex substract(Complex dao)
    {
        int real = x - dao.getReal();
        int imag = y - dao.getImagination();
        return new Complex (real , imag);
    }
    public Complex substract(int dao){
        int real = x - dao;
        int imag = y - 0;
        return new Complex(real,imag);
    }
    public Complex mul(int z){
        int real = x * z;
        int imag = y * z;
        return new Complex (real , imag);
    }
    public Complex mul(Complex dao){
        int real = ((x * dao.getReal())-(y * dao.getImagination()));
        int imag = ((x * dao.getImagination())+(y * dao.getReal()));
        return new Complex (real , imag);
    }
    public static double magnit(Complex dao){
        double magnitude = Math.sqrt((dao.getReal() * dao.getReal())+(dao.getImagination() * dao.getImagination()));
        return magnitude;
    }
    public boolean Compare(Complex dao){
        return x == dao.x && y == dao.y;        
    }
    
    public String toString()
    {
        return  x + "+" + y +"i";
    }
}
