import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSoma () {
        Calculadora calc = new Calculadora(7, 3);
        Assert.assertEquals(10, calc.soma(), 0);
    }

    @Test
    public void testSubtrai() {
        Calculadora calc = new Calculadora(9, 4);
        Assert.assertEquals(5, calc.subtrai(), 0);
    }

    @Test
    public void testMultiplica() {
        Calculadora calc = new Calculadora(18, 11);
        Assert.assertEquals(198, calc.multiplica(), 0);
    }

    @Test
    public void testDivide() {
        Calculadora calc = new Calculadora(100, 4);
        Assert.assertEquals(25, calc.divide(), 0);
    }
}
