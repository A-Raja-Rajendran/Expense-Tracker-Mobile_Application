package com.example.savss.expensetracker;

import junit.framework.TestCase;

import org.junit.Assert;

import java.util.Date;

public class UserDataTest extends TestCase {
    UserData td=new UserData();

    public void testGetId() {
        UserData.userID =1;
        Assert.assertEquals(1,UserData.userID);

    }
    public void testGetName() {
        UserData.Name ="Raja";
        Assert.assertEquals("Raja",UserData.Name);
    }

    public void testGetPassword() {
        UserData.password="Raja@212";
        Assert.assertEquals("Raja@212",UserData.password);
    }

    public void testGetdateOfBirth() {
        UserData.dateOfBirth="12/10/2002";
        Assert.assertEquals("12/10/2002",UserData.dateOfBirth);
    }

    public void testGetphoneNumber() {
        UserData.phoneNumber="8667665962";
        Assert.assertEquals("8667665962",UserData.phoneNumber);
    }

    public void testGetemail() {
        UserData.email="raja@gmail.com";
        Assert.assertEquals("raja@gmail.com",UserData.email);
    }

    public void testGetTransactionType() {
        UserData.address="cuddalore";
        Assert.assertEquals("cuddalore",UserData.address);
    }

}