import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiTest {

    @Test
    public void testSumar() {
        Calc calc = new Calc(2, 2);
        Integer result = calc.sumar();
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testSumarUnoMasUno() {
        Calc calc = new Calc(1, 1);
        Integer result = calc.sumar();
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testsRestar() {
        Calc calc = new Calc(4, 2);
        Integer result = calc.restar();
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testsRestarUnoMenosUno() {
        Calc calc = new Calc(1, 1);
        Integer result = calc.restar();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testsMultiplicar() {
        Calc calc = new Calc(4, 2);
        Integer result = calc.multi();
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testsMultPorCero() {
        Calc calc = new Calc(4, 0);
        Integer result = calc.multi();
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testsDividir() {
        Calc calc = new Calc(4, 2);
        Integer result = calc.divi();
        Assertions.assertEquals(2, result);
    }

}
