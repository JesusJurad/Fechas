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
public class FechasTestEquivalencia {
    
    public FechasTestEquivalencia() {
    }

    /**
     * Test of esFacturaCorrectaEnFecha method, of class Fechas.
     */
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_1() throws Exception {
        System.out.println("Test Particiones Caso 1.1");
        Fechas f1 = new Fechas();
        String valor = "2021-05-25";
        int respuestaEsp = -1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_2() throws Exception {
        System.out.println("Test Particiones Caso 1.2");
        Fechas f1 = new Fechas();
        String valor = f1.Hoy();
        int respuestaEsp = 0;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
    @Test
    public void testEsFacturaCorrectaEnFechaCaso1_3() throws Exception {
        System.out.println("Test Particiones Caso 1.3");
        Fechas f1 = new Fechas();
        String valor = "2021-06-02";
        int respuestaEsp = 1;
        assertEquals(respuestaEsp, f1.esFacturaCorrectaEnFecha(valor));
    }
    
}
