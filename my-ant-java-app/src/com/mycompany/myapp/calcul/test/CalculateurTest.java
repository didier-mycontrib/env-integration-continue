package com.mycompany.myapp.calcul.test;

import junit.framework.TestCase;

import com.mycompany.myapp.calcul.Calculateur;

public class CalculateurTest extends TestCase {
	
private Calculateur c;

protected void setUp(){
  c = new Calculateur();
}


public void testRacine(){
	 assertEquals( c.racineCarree(9) , 3 , 0.000001 );
}


public void testAxb(){
	 assertEquals( c.axb(2, 3, 4) , 10 , 0.000001 );
}


}
