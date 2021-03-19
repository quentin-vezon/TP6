package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaquinTest {


    Taquin t3x3v;
    Taquin t3x3f;
    Taquin t4x4v;
    Taquin t4x4f;
    Taquin t5x5v;
    Taquin t5x5f;

    @BeforeEach
    public void init() {
        int[][] data3x3f = { { 1, 2, 0 }, { 4, 5, 3 }, { 7, 8, 6 } }; // 0 en position [0][2]
        t3x3f = new Taquin(data3x3f);

        int[][] data3x3v = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 0 } }; // 0 en position [2][2]
        t3x3v = new Taquin(data3x3v);

        int[][] data4x4f = { { 1, 2, 0, 12 }, { 4, 5, 3, 13 }, { 7, 8, 6, 14 }, { 11, 10, 9, 15 } };// 0 en position
        // [0][2]
        t4x4f = new Taquin(data4x4f);

        int[][] data4x4v = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 0 } };// 0 en position
        // [3][3]
        t4x4v = new Taquin(data4x4v);

        int[][] data5x5f = { { 1, 2, 8, 15, 16 }, { 4, 5, 3, 17, 18 }, { 7, 0, 6, 19, 20 }, { 11, 10, 9, 21, 22 },
                { 13, 12, 14, 23, 24 } };// 0 en position [2][1]
        t5x5f = new Taquin(data5x5f);

        int[][] data5x5v = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 0 } };// 0 en position [4][4]
        t5x5v = new Taquin(data5x5v);
    }

    // Test est gagant ////////
    // @Disabled
    @Test
    public void test_est_gagnant_faux_3_X_3() {
        assertFalse(t3x3f.estGagnant());
    }

    // @Disabled
    @Test
    public void test_est_gagnant_vrai_3_X_3() {
        assertTrue(t3x3v.estGagnant());
    }

    // @Disabled
    @Test
    public void test_est_gagnant_faux_4_X_4() {
        assertFalse(t4x4f.estGagnant());
    }

    // @Disabled
    @Test
    public void test_est_gagnant_vrai_4_X_4() {
        assertTrue(t4x4v.estGagnant());
    }

    // @Disabled
    @Test
    public void test_est_gagnant_faux_5_X_5() {
        assertFalse(t5x5f.estGagnant());
    }

    // @Disabled
    @Test
    public void test_est_gagnant_vrai_5_X_5() {
        assertTrue(t5x5v.estGagnant());
    }

    // Test Equals ///////////////
    // @Disabled
    @Test
    public void test_equals_vrai_3_X_3_1() {
        int[][] data = { { 1, 2, 0 }, { 4, 5, 3 }, { 7, 8, 6 } };
        Taquin t = new Taquin(data);
        int[][] data2 = { { 1, 2, 0 }, { 4, 5, 3 }, { 7, 8, 6 } };
        Taquin t2 = new Taquin(data2);
        assertEquals(t, t2);
    }

    // @Disabled
    @Test
    public void test_equals_vrai_3_X_3_2() {
        assertEquals(t3x3f, t3x3f);
    }

    // @Disabled
    @Test
    public void test_equals_faux_3_X_3_1() {
        assertNotEquals(t3x3f, t3x3v);
    }

    // @Disabled
    @Test
    public void test_equals_faux_3_X_3_2() {
        assertNotEquals(t3x3f, t5x5f);
    }

    // @Disabled
    @Test
    public void test_equals_faux_3_X_3_3() {
        assertNotEquals(t3x3f, t5x5f);
    }

    // Test trouver trou ///////////////////

    // @Disabled
    @Test
    public void test_trouver_trou_3_X_3() {
        int[][] data = { { 1, 2, 0 }, { 4, 5, 3 }, { 7, 8, 6 } };
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = { 0, 2 };
        assertArrayEquals(res2, res);
    }


    // @Disabled
    @Test
    public void test_trouver_trou_3_X_3_2() {
        int[] res = t3x3f.trouverTrou();
        int[] res2 = { 0, 2 };
        assertArrayEquals(res2, res);
    }

    // @Disabled
    @Test
    public void test_trouver_trou_3_X_3_3() {
        int[] res = t3x3v.trouverTrou();
        int[] res2 = { 2, 2 };
        assertArrayEquals(res2, res);
    }

    // @Disabled
    @Test
    public void test_trouver_trou_4_X_4_1() {
        int[] res = t4x4f.trouverTrou();
        int[] res2 = { 0, 2 };
        assertArrayEquals(res2, res);
    }


    // @Disabled
    @Test
    public void test_trouver_trou_4_X_4_2() {
        int[] res = t4x4v.trouverTrou();
        int[] res2 = { 3, 3 };
        assertArrayEquals(res2, res);
    }

    // @Disabled
    @Test
    public void test_trouver_trou_5_X_5_1() {
        int[] res = t5x5f.trouverTrou();
        int[] res2 = { 2, 1 };
        assertArrayEquals(res2, res);
    }

    // @Disabled
    @Test
    public void test_trouver_trou_5_X_5_2() {
        int[] res = t5x5v.trouverTrou();
        int[] res2 = { 4, 4 };
        assertArrayEquals(res2, res);
    }





    //////////////////////



    // @Disabled
    @Test
    public void test_generer_Fils_coin_3_X_3() {
        int[][] data = { { 1, 2, 0 }, { 4, 5, 3 }, { 7, 8, 6 } };
        Taquin t = new Taquin(data);
        ArrayList<Taquin> res = t.genererFils();
        ArrayList<Taquin> res2 = new ArrayList<>();
        int[][] datafils1 = { { 1, 2, 3 }, { 4, 5, 0 }, { 7, 8, 6 } };
        Taquin fils1 = new Taquin(datafils1);
        int[][] datafils2 = { { 1, 0, 2 }, { 4, 5, 3 }, { 7, 8, 6 } };
        Taquin fils2 = new Taquin(datafils2);
        res2.add(fils1);
        res2.add(fils2);
        assertTrue(res.containsAll(res2) && res2.containsAll(res));
    }





  //  @Disabled
    @Test
    public void test_trouver_trou_coin_hd_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[] res = t.trouverTrou();
        int[] res2 = {0, 2};
        assertArrayEquals(res2, res);
    }

   // @Disabled
    @Test
    public void test_equals_vrai_3_X_3() {
        int[][] data = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t = new Taquin(data);
        int[][] data2 = {{1, 2, 0}, {4, 5, 3}, {7, 8, 6}};
        Taquin t2 = new Taquin(data2);
        assertEquals(t, t2);
    }




}