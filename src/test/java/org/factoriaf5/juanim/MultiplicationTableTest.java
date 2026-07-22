package org.factoriaf5.juanim;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableTest {

    @Test //Test original. Comprueba el funcionamento de generate con el 5.
    void generatesTableForFive() {
        MultiplicationTable table = new MultiplicationTable();

        List<String> result = table.generate(5);

        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0));
        assertEquals("5 x 10 = 50", result.get(9));
    }
    @Test //Test de escenario. Comprueba el funcionamiento del método generate con 0.
    void generatesTableForZero() {
        MultiplicationTable table = new MultiplicationTable();
        List<String> result = table.generate(0);

        assertEquals("0 x 1 = 0", result.get(0));
        assertEquals("0 x 10 = 0", result.get(9));
    }
    @Test //Test de escenario. Comprueba el funcionamiento de los números negativos.
    void generatesTableForNegativeNumber() {
        MultiplicationTable table = new MultiplicationTable();
        List<String> result = table.generate (-3);

        assertEquals("-3 x 1 = -3", result.get(0));
        assertEquals("-3 x 10 = -30", result.get(9));
    }
}