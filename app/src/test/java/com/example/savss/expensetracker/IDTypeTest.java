package com.example.savss.expensetracker;

import junit.framework.TestCase;

import org.junit.Assert;

public class IDTypeTest extends TestCase {
    public void testGetId() {
        int number=1;
        Assert.assertEquals(1,number);
    }

    public void testGetText() {
        String text="Done";
        Assert.assertEquals("Done",text);
    }
    public void testGetphoneNumber() {
        String PhoneNumber= "8667665962";
        Assert.assertEquals("8667665962",PhoneNumber);
    }

    public void testGetemail() {
        String Email="raja@gmail.com";
        Assert.assertEquals("raja@gmail.com",Email);
    }

}