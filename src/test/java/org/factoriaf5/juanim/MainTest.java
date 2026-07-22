package org.factoriaf5.juanim;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void runsWithoutErrorAndProducesOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured));

        try {
            Main.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }

        assertTrue(captured.toString().length() > 0);
    }
}