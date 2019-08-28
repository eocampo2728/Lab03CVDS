/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.tdd.aerodescuentos;

import edu.eci.cvds.tdd.registry.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
        Assert.assertEquals(respuesta, CalculadorDescuentos.calculoTarifa(100,10,14));
    }
}
