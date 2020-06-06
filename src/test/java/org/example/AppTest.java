package org.example;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void PrintTest_7_8_9() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int[] outputList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        App param = new App(3, inputList);
        param.printNext();
        assertArrayEquals(outputList, param.sequence.stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void PrintTest_37_46() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,4,7,11,16,22,29));
        int[] outputList = new int[]{1,2,4,7,11,16,22,29,37,46};

        App param = new App(2, inputList);
        param.printNext();
        assertArrayEquals(outputList, param.sequence.stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void PrintTest_11_56() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1,1,2));
        int[] outputList = new int[]{1,1,1,1,1,1,1,1,1,2,11,56};

        App param = new App(2, inputList);
        param.printNext();
        assertArrayEquals(outputList, param.sequence.stream().mapToInt(i -> i).toArray());
    }

    @Test
    public void PrintTest_3() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(3));
        int[] outputList = new int[]{3,3,3,3,3,3,3,3,3,3,3};

        App param = new App(10, inputList);
        param.printNext();
        assertArrayEquals(outputList, param.sequence.stream().mapToInt(i -> i).toArray());
    }
}
