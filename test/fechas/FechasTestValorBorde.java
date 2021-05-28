/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author jesus_jurado_barrau
 */
public class FechasTestValorBorde {
    
    public FechasTestValorBorde() {
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaCorrectaEnFechaCaso2_1() throws Exception {
        System.out.println("Test Particiones Caso 2.1");
        Fechas f1 = new Fechas();
        String valor = "2021-05-28";
        int respuestaEsp = 0;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso2_2() throws Exception {
        System.out.println("Test Particiones Caso 2.2");
        Fechas f1 = new Fechas();
        String valor = "2021-05-27";
        int respuestaEsp = -1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_3() throws Exception {
        System.out.println("Test Particiones Caso 2.3");
        Fechas f1 = new Fechas();
        String valor = "2021-05-29";
        int respuestaEsp = 1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
}
