/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jesus_jurado_barrau
 */
@RunWith(value = Parameterized.class)
public class FechasTestParametro {
    
    private String fecha;
    private int resultado;
    
    public FechasTestParametro(String fecha, int resultado) {
        this.fecha = fecha;
        this.resultado = resultado;
    }
    
    @Parameters
    public static Iterable<Object[]> getData(){
        List<Object[]> obj = new ArrayList<>();
        obj.add(new Object[]{"2021-05-25",-1});
        obj.add(new Object[]{"2021-05-28",0});
        obj.add(new Object[]{"2021-06-02",1});
        obj.add(new Object[]{"2021-05-28",0});
        obj.add(new Object[]{"2021-05-27",-1});
        obj.add(new Object[]{"2021-05-29",1});
        return obj;
        
    }
    
    @Test
    public void testEsFacturaCorrectaEnFecha() throws Exception {
        System.out.println("Test Particiones Parametro");
        Fechas f1 = new Fechas();
        assertEquals(this.resultado, f1.esFacturaCorrectaEnFecha(this.fecha));
    }
    
}
