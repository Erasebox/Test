package com.example.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class HomeworkUnitTest {
    @Test
    public void testScore() {
        MainActivity.MyTest test = new MainActivity.MyTest();
        for(int i=0;i<20;i++){
            test.Try(0);
        }
        assertEquals(20,test.score);
    }
}