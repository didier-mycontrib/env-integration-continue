package com.mycompany.myapp.basic;

/**
 * BasicCalculateur (+,-,*,/)
 */
public class BasicCalculateur 
{
    public double add(double a,double b){
      return a+b;
    }
    
    public double mult(double a,double b){
      return a*b; //v1
      //return a+b; //v2:return a+b;  au lieu a*b;
      //erreur inaperçue si test avec a=2 et b=2 (2+2=4 et 2*2=4)
    }
    
    public double div(double a,double b){
        return a/b;
      }
      
    public double substract(double a,double b){
        return a-b;
      }
    
}
