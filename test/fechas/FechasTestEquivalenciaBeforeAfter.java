/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author jesus_jurado_barrau
 */
public class FechasTestEquivalenciaBeforeAfter {
    
    private Fechas f1;
    
    public FechasTestEquivalenciaBeforeAfter() {
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
