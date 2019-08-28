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
    public void deberiaTenerDescuentoMenorDeEdad() {
        double respuesta = 95.0;
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,10,14),0);
    }
}
