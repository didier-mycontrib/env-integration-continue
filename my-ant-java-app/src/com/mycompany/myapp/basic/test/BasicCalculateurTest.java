package com.mycompany.myapp.basic.test;

import com.mycompany.myapp.basic.BasicCalculateur;

import junit.framework.TestCase;


/**
 * JUnit3 test for simple Calculateur.
 */
public class BasicCalculateurTest 
    extends TestCase
{
    private BasicCalculateur c;

    protected void setUp(){
      c = new BasicCalculateur();
    }
    
    public void testAdd()
    {
        assertEquals( c.add(5,6) , 11 , 0.000001 );
    }
    
    public void testMult()
    {
        assertEquals( c.mult(2,2) ,4 , 0.000001 );//par hazard 2+2=2*2=4
    }
}
