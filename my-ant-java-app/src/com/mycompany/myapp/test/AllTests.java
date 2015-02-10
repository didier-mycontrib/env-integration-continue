package com.mycompany.myapp.test;

import junit.framework.Test;
import junit.framework.TestSuite;

import com.mycompany.myapp.basic.test.BasicCalculateurTest;
import com.mycompany.myapp.calcul.test.CalculateurTest;

//JUNit3 Test Suite
public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
        suite.addTestSuite(BasicCalculateurTest.class);
        suite.addTestSuite(CalculateurTest.class);
		//$JUnit-END$
		return suite;
	}

}
