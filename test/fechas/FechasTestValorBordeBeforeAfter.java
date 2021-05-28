/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author jesus_jurado_barrau
 */
public class FechasTestValorBordeBeforeAfter {
    
    private Fechas f1;
    
    public FechasTestValorBordeBeforeAfter() {
    }
    
    @Before
    public void setUp() {
        System.out.println("SetUp => Before");
        f1 = new Fechas();
    }
    
    @After
    public void tearDown() {
        System.out.println("TearDown => After");
        f1 = null;
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
