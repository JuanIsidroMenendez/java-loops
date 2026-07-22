package org.factoriaf5.juanim;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable();
        TablePrinter printer = new TablePrinter();

        List<String> lines = table.generate(5);
        printer.print(lines);
    }
}