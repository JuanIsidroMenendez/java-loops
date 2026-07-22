package org.factoriaf5.juanim;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TablePrinterTest {

    @Test
    void printsEachLineToConsole() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured));

        try {
            new TablePrinter().print(List.of("5 x 1 = 5", "5 x 2 = 10"));
        } finally {
            System.setOut(originalOut);
        }

        String output = captured.toString();
        assertTrue(output.contains("5 x 1 = 5"));
        assertTrue(output.contains("5 x 2 = 10"));
    }
}