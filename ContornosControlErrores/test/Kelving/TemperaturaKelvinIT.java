/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kelving;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dam115
 */
public class TemperaturaKelvinIT {
    
    public TemperaturaKelvinIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void testTemperaturaKelvin(){
        System.out.println("   **Constructor  **");
        System.out.println("1-Prueba constructor sin datos");
        TemperaturaKelvin sindato= new TemperaturaKelvin();
        assertNotNull(sindato);
        //otra forma
        System.out.println("prueba getTemperaturaKelvin()");
        assertEquals(0, sindato.getTemperaturaKelvin(),0.0);
        
        System.out.println("2-Prueba constructor con dato == 50 ");
        TemperaturaKelvin objeto =new TemperaturaKelvin(50);
        assertArrayEquals(50, objeto.getTemperaturaKelvin(),0.0);
    }
    /**
     * Test of getTemperaturaCelsius method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaCelsius() {
        System.out.println("getTemperaturaCelsius");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = 0.0;
        double result = instance.getTemperaturaCelsius();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");//las fail
    }

    /**
     * Test of getTemperaturaFahrenheit method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaFahrenheit() {
        System.out.println("getTemperaturaFahrenheit");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = 0.0;
        double result = instance.getTemperaturaFahrenheit();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getTemperaturaKelvin method, of class TemperaturaKelvin.
     */
    @Test
    public void testGetTemperaturaKelvin() {
        System.out.println("getTemperaturaKelvin");
        TemperaturaKelvin instance = new TemperaturaKelvin();
        double expResult = 0.0;
        double result = instance.getTemperaturaKelvin();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperaturaKelvin method, of class TemperaturaKelvin.
     */
    @Test
    public void testSetTemperaturaKelvin() {
        System.out.println("setTemperaturaKelvin");
        TemperaturaKelvin instance = new TemperaturaKelvin();//le asigno un valor
        instance.setTemperaturaKelvin(5.0);
         assertEquals(5.0, instance.getTemperaturaKelvin(), 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    
}
