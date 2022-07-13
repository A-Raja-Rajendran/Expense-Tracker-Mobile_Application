package com.example.savss.expensetracker;

import junit.framework.TestCase;

import org.junit.Assert;

import java.util.ArrayList;

public class BarChartExpenseDataTest extends TestCase {
    BarChartExpenseData bar=new BarChartExpenseData();

    public void testAdd() {
        bar.add("Movie",2000,100);
    }

    public void testGetBarDataSet() {
        Assert.assertEquals(100,100);
    }

    public void testGetCount() {
        Assert.assertEquals(0,bar.count());
    }

    public void testGetTotalExpenseAmount() {
        ArrayList<String> a = new ArrayList<>();
        Assert.assertEquals(a,bar.getCategories());
    }
}


