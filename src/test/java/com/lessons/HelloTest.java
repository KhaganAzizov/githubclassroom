package com.lessons;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.*;

public class HelloTest {

    @Test
    public void testHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Main.main(null);

        // assertion
        assertEquals("Hello world!\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}