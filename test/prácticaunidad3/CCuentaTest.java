/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prácticaunidad3;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;

/**
 *
 * @author José Manuel Caballero Sosa
 */
public class CCuentaTest extends TestCase {
    
    public CCuentaTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of ingresar method, of class CCuenta.
    
    public void testIngresar() {
        System.out.println("ingresar");
        double cantidad = 1000.0;
        CCuenta instance = new CCuenta();
        try {
            instance.ingresar(cantidad);
        } catch (Exception ex) {
            Logger.getLogger(CCuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        double expResult = 1000.0;
        double result = instance.estado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }
 */
    
    /**
     * Test of retirar method, of class CCuenta.
    */
    public void testRetirar()  {
        System.out.println("retirar");
        
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",500,0);
        double cantidad = 200.0;
        try {
            instance.retirar(cantidad);
        } catch (Exception ex) {
            Logger.getLogger(CCuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        double expResult = 300.0;
        double result = instance.estado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }
  
    
    /**
     * Test of retirar method, of class CCuenta.

    public void testIngresarYretirar()  {
        System.out.println("Ingresar y retirar");
        double cantidad = 200.0;
        
        CCuenta instance = new CCuenta("Juan López","1000-2365-85-123456789",cantidad,0);
        
        try {
            instance.ingresar(10);
        } catch (Exception ex) {
            Logger.getLogger(CCuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            instance.retirar(211);
        } catch (Exception ex) {
            Logger.getLogger(CCuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        double expResult = 210.0;
        double result = instance.estado();
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult)
            fail("The test case is a prototype.");
    }
     */
}
