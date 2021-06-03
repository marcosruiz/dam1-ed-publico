import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Contador2Test {

    PrintStream consoleOutput;
    PipedOutputStream testInput;
    PipedOutputStream out;
    PipedInputStream testOutput;

    @BeforeEach
    public void setUp() throws IOException {
        PrintStream consoleOutput = System.out;
        PipedOutputStream testInput = new PipedOutputStream();
        PipedOutputStream out = new PipedOutputStream();
        PipedInputStream testOutput = new PipedInputStream(out);
        System.setIn(new PipedInputStream(testInput));
        System.setOut(new PrintStream(out));
    }

    /**
     * Camino: 01234563F
     */
    @Test
    public void firstTest(){

    }

}