/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleja
 */
public class AvaluadorTest1 {

    private Avaluador instance;

    public AvaluadorTest1() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Avaluador();
    }

    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of mitjanaSiSupera method, of class Avaluador.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjanaSiSupera() throws Exception {
        assertEquals(6.6, instance.mitjanaSiSupera(new Estudiant("Alejandro", 8, 7, 5)), 1.0E-1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(5.0, instance.mitjana(new Estudiant("Jordi", 3, 7, 5)), 1.0E-1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
    }

}
