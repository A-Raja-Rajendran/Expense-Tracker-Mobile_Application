package com.example.savss.expensetracker;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        int i=0;
        for(i=0;i<10;i++)
        {
            assertEquals(i+1, i+1);
        }
    }
}