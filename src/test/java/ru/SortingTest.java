package test.java.ru;

import main.recursiveMethod;
import org.junit.Test;
import static org.junit.Assert.*;

public class SortingTest {

    @Test
    public void sortingCheck() throws Exception {

        //Включать в зависимости от выбранного массива
        //Первый массив из примера:
        assertArrayEquals(recursiveMethod.getElementsInArray(), new int[] {63, 106});
        //Второй массив из примера:
        //assertArrayEquals(recursiveMethod.getElementsInArray(), new int[] {7, 10});

    }
}
