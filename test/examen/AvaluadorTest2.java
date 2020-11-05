/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author aleja
 */
@RunWith(Parameterized.class)
public class AvaluadorTest2 {

    private Avaluador instance;

    @Parameterized.Parameter(0)
    public Estudiant estudiant;
    @Parameterized.Parameter(1)
    public double mitjana;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Object[][] data = new Object[][]{
            {new Estudiant("Alejandro", 1, 1, 1), 1},
            {new Estudiant("Lluís", 2, 2, 2), 2},
            {new Estudiant("Pedro", 3, 3, 3), 3},
            {new Estudiant("Ramón", 4, 4, 4), 4},
            {new Estudiant("Adrián", 5, 5, 5), 5},
            {new Estudiant("Joan", 6, 6, 6), 6},
            {new Estudiant("Iván", 7, 7, 7), 7},
            {new Estudiant("Laura", 8, 8, 8), 8},
            {new Estudiant("José", 9, 9, 9), 9},
            {new Estudiant("Celeste", 10, 10, 10), 10},
            {new Estudiant("Andrea", 9, 9, 9), 9},
            {new Estudiant("Carlos", 8, 8, 8), 8},
            {new Estudiant("Eric", 7, 7, 7), 7},
            {new Estudiant("Lidia", 6, 6, 6), 6},
            {new Estudiant("Mireia", 5, 5, 5), 5}
        };
        return Arrays.asList(data);
    }

    public AvaluadorTest2() {
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
        assertEquals(mitjana, instance.mitjanaSiSupera(estudiant), 1.0E-1);
    }

    /**
     * Test of mitjana method, of class Avaluador.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testMitjana() throws Exception {
        assertEquals(mitjana, instance.mitjana(estudiant), 1.0E-1);
    }

    /**
     * Test of millorEstudiantPerNotaMitjana method, of class Avaluador.
     */
    @Test
    public void testMillorEstudiantPerNotaMitjana() {
    }

}
