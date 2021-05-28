/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author jesus_jurado_barrau
 */
public class FechasTestValorBordeClase {
    
    private static Fechas f1;
    
    public FechasTestValorBordeClase() {
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
    
    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaCorrectaEnFechaCaso2_1() throws Exception {
        System.out.println("Test Particiones Caso 2.1");
        String valor = "2021-05-28";
        int respuestaEsp = 0;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso2_2() throws Exception {
        System.out.println("Test Particiones Caso 2.2");
        String valor = "2021-05-27";
        int respuestaEsp = -1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_3() throws Exception {
        System.out.println("Test Particiones Caso 2.3");
        String valor = "2021-05-29";
        int respuestaEsp = 1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
}
