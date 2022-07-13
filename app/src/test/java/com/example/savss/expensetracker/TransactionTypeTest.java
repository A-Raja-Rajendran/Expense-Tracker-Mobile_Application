package com.example.savss.expensetracker;

import junit.framework.TestCase;

import org.junit.Assert;

import java.util.Date;

public class TransactionTypeTest extends TestCase {
    Date da=new Date();
    TransactionData td=new TransactionData(1,"2000",da,"Income","ticket","cash");

    public void testValueOf() {
        Assert.assertEquals("Income",td.getCategory());
    }
}