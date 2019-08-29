/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author 2120046
 */
public class TarifasTest {
    
    public TarifasTest() {
    }
    
    @Test
    public void noDeberiaCorrer() {
        boolean valid;
        try{
            valid = true;
            double respuesta = CalculadorDescuentos.calculoTarifa(-100,-1,-1);
        }catch(Exception e){
            valid = false;
            Assert.assertFalse(valid);
        }
        
    }
    
    @Test
    public void noDeberiaTenerDescuento() {
        double respuesta = 100.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,10,20),0);
    }
    
    @Test
    public void deberiaTenerDescuentoDiasDeAntelacion() {
        double respuesta = 85.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,21,20),0);
    }
    
    @Test
    public void deberiaTenerDescuentoMenorDeEdad() {
        double respuesta = 95.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,10,14),0);
    }
    
    @Test
    public void deberiaTenerDescuentoTerceraEdad() {
        double respuesta = 92.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,10,70),0);
    }
    
    @Test
    public void deberiaTenerDescuentoMenorDeEdadYDiasDeAntelacion() {
        double respuesta = 80.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,21,13),0);
    }
    
    @Test
    public void deberiaTenerDescuentoTerceraEdadYDiasDeAntelacion() {
        double respuesta = 77.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,21,70),0);
    }
    
}
    
