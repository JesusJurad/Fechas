/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author jesus_jurado_barrau
 */
public class FechasTestEquivalenciaClase {
    
    private static Fechas f1;
    
    public FechasTestEquivalenciaClase() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("SetUpClass => BeforeClass");
        f1 = new Fechas();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("TearDownClass => AfterClass");
        f1 = null;
    }
    
    @Before
    public void setUp() {
        System.out.println("SetUp => Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("TearDown => After");
    }

    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_1() throws Exception {
        System.out.println("Test Particiones Caso 1.1");
        String valor = "2021-05-25";
        int respuestaEsp = -1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_2() throws Exception {
        System.out.println("Test Particiones Caso 1.2");
        String valor = f1.Hoy();
        int respuestaEsp = 0;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_3() throws Exception {
        System.out.println("Test Particiones Caso 1.3");
        String valor = "2021-06-02";
        int respuestaEsp = 1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
}
