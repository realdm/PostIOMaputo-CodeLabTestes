package app.gdg.maputo.codelabtestes;

import static org.junit.Assert.*;

/**
 * Created by Mac on 7/8/2015.
 */
public class CalculatorTest {

    Calculator mCalculator;

    @org.junit.Before
    public void setUp() throws Exception {

        //cria nova instancia da Calculadora
        mCalculator = new Calculator();
    }

    @org.junit.Test
    public void testSum() throws Exception {

        //testa soma 4 e 3 que deve dar 7
        assertEquals(7d,mCalculator.sum(4d,3d),0);
    }

    @org.junit.Test
    public void testSubstract() throws Exception {

        //testa subtracao 4 e 3 deve dar 1
        assertEquals(1d,mCalculator.substract(4d,3d),0);
    }

    @org.junit.Test
    public void testDivide() throws Exception {

        //testa divisao 4 e 2 deve dar 2
        assertEquals(2d,mCalculator.divide(4d,2d),0);
    }


    @org.junit.Test
    public void testMultiply() throws Exception {

        //testa multiplicacao 4 e 3 deve dar 12
        assertEquals(12d,mCalculator.multiply(4d,3d),0);
    }
}