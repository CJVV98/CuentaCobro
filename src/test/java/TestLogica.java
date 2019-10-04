/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Corin V
 */
public final class TestLogica {
    public String profesion="Ingeniero";
    public String nombre="Andrea";
    public String[] idiomas;
    public TestLogica() {
        
        idiomas=new String[] {"Ingles","Frances"};
        pruebasLogicanombre();
        pruebasLogicaIdioma();
        pruebaLogicaCalcularSueldo();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void pruebasLogicanombre() {
        int dias=0;
        int sueldo=0;
        assertTrue(dias<=0);
        assertEquals(profesion, "Ingeniero");
        assertEquals(nombre, "Andrea");
    }
    @Test
    public void pruebasLogicaIdioma() {
        assertEquals(idiomas.length, 2);
    }
    @Test
    public void pruebaLogicaCalcularSueldo() {
        int sueldo=0;
        if("Ingeniero".equals(profesion))
            sueldo+=200000*10;
        for (String idioma1 : idiomas) {
                if(idioma1.equals("Ingles"))
                    sueldo+=80000;
                if(idioma1.equals("Frances"))
                    sueldo+=180000;
                if(idioma1.equals("Aleman"))
                    sueldo+=330000;
        }
        assertEquals(sueldo,2260000);
    }
}
