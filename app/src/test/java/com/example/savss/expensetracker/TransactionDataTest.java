package com.example.savss.expensetracker;

import junit.framework.TestCase;

import org.junit.Assert;

import java.util.Date;

public class TransactionDataTest extends TestCase {
    Date da=new Date();
    TransactionData td=new TransactionData(1,"2000",da,"Movies","ticket","cash");

    public void testGetId() {
        Assert.assertEquals(1,td.getId());

    }

    public void testGetAmount() {
        Assert.assertEquals("2000",td.getAmount());
    }

    public void testGetDateTime() {
        Assert.assertEquals(da,td.getDateTime());
    }

    public void testGetCategory() {
        Assert.assertEquals("Movies",td.getCategory());
    }

    public void testGetDescription() {
        Assert.assertEquals("ticket",td.getDescription());
    }

    public void testGetTransactionType() {
        Assert.assertEquals("Cash",td.getTransactionType());
    }
}