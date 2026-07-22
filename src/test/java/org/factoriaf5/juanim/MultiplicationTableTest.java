package org.factoriaf5.juanim;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTableTest {

    @Test
    void generatesTableForFive() {
        MultiplicationTable table = new MultiplicationTable();

        List<String> result = table.generate(5);

        assertEquals(10, result.size());
        assertEquals("5 x 1 = 5", result.get(0));
        assertEquals("5 x 10 = 50", result.get(9));
    }
}