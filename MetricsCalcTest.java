import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MetricsCalcTest {

    @Test
    public void testCelcius2Farenheit() {
        MetricsCalc calc = new MetricsCalc();
        assertEquals(32.0, calc.celcius2Farenheit(0), 0.001);
        assertEquals(212.0, calc.celcius2Farenheit(100), 0.001);
        assertEquals(98.6, calc.celcius2Farenheit(37), 0.001);
    }

    @Test
    public void testFeet2Meter() {
        MetricsCalc calc = new MetricsCalc();
        assertEquals(0.3048, calc.feet2Meter(1), 0.001);
        assertEquals(3.048, calc.feet2Meter(10), 0.001);
        assertEquals(30.48, calc.feet2Meter(100), 0.001);
    }
}
