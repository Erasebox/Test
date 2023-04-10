package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class HomeworkUnitTest {

    private MainActivity.MyTest test;

    @Before
    public void setUp() throws Exception {
        test = new MainActivity.MyTest();
    }

    @Test
    public void testScore() {
        repeatedCheck(0,20);
        assertEquals(-10, test.result());
    }

    @Test
    public void newTestScore() {
        repeatedCheck(1, 20);
        assertEquals(20,test.result());
    }

    @Test
    public void newTestSpare() {
        TryASpare();
        test.Try(6);
        repeatedCheck(0, 17);
        assertEquals(14,test.result());
    }

    @Test
    public void newTestStrike() {
        TryStrike();
        test.Try(3);
        test.Try(4);
        repeatedCheck(0, 16);
        assertEquals(16,test.result());
    }

    @Test
    public void fullTestStrike() {
        repeatedCheck(10, 12);
        assertEquals(300,test.result());
    }

    private void TryStrike() {
        test.Try(10);
    }

    private void TryASpare() {
        test.Try(3);
        test.Try(7);
    }

    private void repeatedCheck(int i, int times) {
        for(int j=0;j<times;j++){
            test.Try(i);
        }
    }



}