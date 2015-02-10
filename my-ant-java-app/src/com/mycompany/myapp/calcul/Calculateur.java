package com.mycompany.myapp.calcul;

import com.mycompany.myapp.basic.BasicCalculateur;

public class Calculateur {
	
	private BasicCalculateur basicCalculateur = new BasicCalculateur();
	
	
	public double racineCarree(double x){
		return Math.sqrt(x);
	}
	

	//axb(a,x,b) retourne a*x+b
	public double axb(double a,double x,double b){
		return basicCalculateur.add(basicCalculateur.mult(a, x),b);
	}

	
	

}
