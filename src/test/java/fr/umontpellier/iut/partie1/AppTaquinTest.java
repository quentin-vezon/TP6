package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTaquinTest {

    @Disabled
    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> AppTaquin.main(new String[1]));
    }
}