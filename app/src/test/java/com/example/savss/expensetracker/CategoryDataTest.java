package com.example.savss.expensetracker;

import junit.framework.TestCase;

import org.junit.Assert;

public class CategoryDataTest extends TestCase {
    String[] str = {"ani", "sam", "joe"};
    int[] tran = {10, 20, 30};
    CategoryData category = new CategoryData(1, "movies", 200, str, tran, 2000);

    public void testGetId() {
        Assert.assertEquals(1, category.getId());
    }

    public void testTestGetName() {
        Assert.assertEquals("movies", category.getName());
    }

    public void testGetBudget() {
        Assert.assertEquals(200, category.getBudget());
    }

    public void testGetShopnames() {
        Assert.assertArrayEquals(str, category.getShopnames());
    }

    public void testGetTransactionIds() {
        Assert.assertArrayEquals(tran, category.getTransactionIds());
    }

    public void testGetSpent() {
        Assert.assertEquals(2000, category.getSpent());
    }
}