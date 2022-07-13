package com.example.savss.expensetracker;

import com.google.firebase.database.DatabaseReference;

import junit.framework.TestCase;

import org.junit.Assert;

public class FirebaseDBHelperTest extends TestCase {

   String name="gokul",mail="gokul@gmail.com",phone="8667665962",password="Gokul@212";
    public void testAddUser() {
    }
    public void testGetEmail() {
        Assert.assertEquals("gokul@gmail.com",mail);

    }

    public void testGetName() {
        Assert.assertEquals("gokul",name);
    }

    public void testGetNumber() {
        Assert.assertEquals("8667665962",phone);
    }

    public void testGetPassword() {
        Assert.assertEquals("Gokul@212",password);
    }


}