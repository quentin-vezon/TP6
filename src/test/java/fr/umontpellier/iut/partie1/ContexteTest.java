package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ContexteTest {
    //@Disabled
    @Test
    public void test_no_exception() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
    }

    @Test
    public void test_x2_y2() {
        int[][] data = {{0, 1}, {2, 3}};
        Contexte c2 = new Contexte (new Taquin(data));

    }
}