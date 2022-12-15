package br.isadora.servicos;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
    @Test
    public void teste(){
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        /** Condição True == test passed
        Condição False == test passed **/

        Assert.assertEquals(1, 1);
        /** Comparação */

        Assert.assertEquals(0.51, 0.51);
        /** Equals em valor booleano, é depreciado.
         * Use o Delta de comparação [margem de erro] */

        Assert.assertEquals(0.51234, 0.512, 0.001);
        /** O Delta faz a margem de erro do .512... == true*/


        int i = 5;
        Integer i2 = 5;
        //TODO Assert.assertEquals(i, i2); ERRO DE COMPILAÇÃO
        /** Necessita transformar ->
        // TIPO PRIMITIVO para OBJETO: */
        Assert.assertEquals(Integer.valueOf(i), i2);

        /** ou OBJETO para TIPO PRIMITIVO: */
        Assert.assertEquals(i, i2.intValue());

        Assert.assertEquals("bola", "bola");
        Assert.assertEquals("bola", "Bola"); //false

    }
}
