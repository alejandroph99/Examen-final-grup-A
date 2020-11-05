/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.security.InvalidParameterException;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

/**
 *
 * @author aleja
 */
public class AvaluadorTest3 {

    private Avaluador instance;

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Rule
    public Timeout globalTimeout = Timeout.millis(100);

    public AvaluadorTest3() {
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
        thrown.expect(Exception.class);
        thrown.expectCause(Is.isA(InvalidParameterException.class));
        thrown.expectMessage(CoreMatchers.startsWith("Alguna de las parciales es inferior a 5"));
        assertEquals(5.0, instance.mitjanaSiSupera(new Estudiant("Alejandro", 3, 7, 5)), 1.0E-1);
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
