package com.mycompany.myapp;

import java.util.Scanner;

import com.mycompany.myapp.basic.BasicCalculateur;
import com.mycompany.myapp.calcul.Calculateur;

/**
 * App 1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Calculateur (mode texte)" );
        App objApp = new App();
        objApp.interactive_calcul();
    }
    
    private BasicCalculateur basicCalc = new BasicCalculateur();
    private Calculateur calc = new Calculateur();
    private Scanner reader = new Scanner(System.in);
    
    public void interactive_calcul(){
      double x,y,resAdd,resMult,resAxb;
      System.out.print("\nx: "); x = reader.nextDouble();
      System.out.print("\ny: "); y = reader.nextDouble();
      resAdd = basicCalc.add(x,y);
      resMult = basicCalc.mult(x,y);
      //resAxb = calc.axb(x,y,5);
      System.out.println(x+" + "+y+" = "+resAdd);
      System.out.println(x+" * "+y+" = "+resMult);
     // System.out.println(x+" * "+y+"+5 = "+resAxb);
      }
}
