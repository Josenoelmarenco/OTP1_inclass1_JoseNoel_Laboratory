import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    private final TemperatureConverter conv = new TemperatureConverter(); //Evitamos escribir new en cada test

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0,   conv.fahrenheitToCelsius(32),  0.0001); // freezing point
        assertEquals(100.0, conv.fahrenheitToCelsius(212), 0.0001); // boiling point
        assertEquals(37.0,  conv.fahrenheitToCelsius(98.6),0.0001); // body temperature
    }

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0,  conv.celsiusToFahrenheit(0),   0.0001);
        assertEquals(212.0, conv.celsiusToFahrenheit(100), 0.0001);
        assertEquals(98.6,  conv.celsiusToFahrenheit(37),  0.0001);
    }

    @Test
    void testIsExtremeTemperature() {
        // Positive cases: it IS extreme
        assertTrue(conv.isExtremeTemperature(-50)); // very cold  -> below -40
        assertTrue(conv.isExtremeTemperature(60));  // very hot   -> above 50
        // Negative case: it is NOT extreme
        assertFalse(conv.isExtremeTemperature(25));  // normal room temperature
        // Boundary cases: exactly on the limit is NOT extreme (strict < and >)
        assertFalse(conv.isExtremeTemperature(-40)); // exactly -40 -> not extreme
        assertFalse(conv.isExtremeTemperature(50));  // exactly 50  -> not extreme
    }
    @Test
    void testKelvinToCelsius() {
        assertEquals(26.85, conv.kelvinToCelsius(300), 0.0001); // 300 K -> 26.85 C
    }
}
