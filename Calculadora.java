import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSomar() {
        Assert.assertEquals(5, calculadora.somar(2, 3), 0);
        Assert.assertEquals(-1, calculadora.somar(-2, 1), 0);
    }

    @Test
    public void testSubtrair() {
        Assert.assertEquals(-1, calculadora.subtrair(2, 3), 0);
        Assert.assertEquals(-3, calculadora.subtrair(-2, 1), 0);
    }

    @Test
    public void testMultiplicar() {
        Assert.assertEquals(6, calculadora.multiplicar(2, 3), 0);
        Assert.assertEquals(-2, calculadora.multiplicar(-2, 1), 0);
    }

    @Test
    public void testDividir() {
        Assert.assertEquals(2, calculadora.dividir(6, 3), 0);
        Assert.assertEquals(-2, calculadora.dividir(-4, 2), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorZero() {
        calculadora.dividir(5, 0);
    }
}
