package dev_kare_java_loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final ByteArrayInputStream inContent = new ByteArrayInputStream("5\n".getBytes());
    private final InputStream originalIn = System.in;



    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    
    @Test
void testMain() {
    App.main(new String[]{});
    String expectedOutput = "Ingrese un número entero: 5 x 1 = 5\n" +
                            "5 x 2 = 10\n" +
                            "5 x 3 = 15\n" +
                            "5 x 4 = 20\n" +
                            "5 x 5 = 25\n" +
                            "5 x 6 = 30\n" +
                            "5 x 7 = 35\n" +
                            "5 x 8 = 40\n" +
                            "5 x 9 = 45\n" +
                            "5 x 10 = 50\n";
    assertEquals(expectedOutput, outContent.toString());
}

    @Test
    void testImprimirTablaMultiplicar() {
        App.imprimirTablaMultiplicar(3);
        String expectedOutput = "3 x 1 = 3\n3 x 2 = 6\n3 x 3 = 9\n3 x 4 = 12\n3 x 5 = 15\n3 x 6 = 18\n3 x 7 = 21\n3 x 8 = 24\n3 x 9 = 27\n3 x 10 = 30\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}

