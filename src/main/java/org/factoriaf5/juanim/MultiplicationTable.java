package org.factoriaf5.juanim;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {

    public List<String> generate(int n) {
        List<String> lines = new ArrayList<>();
        for (int i = 1; i <=10; i=i+1) {
            lines.add(n + " x " + i + " = " + (n * i));
        }
        return lines;
    }
}
