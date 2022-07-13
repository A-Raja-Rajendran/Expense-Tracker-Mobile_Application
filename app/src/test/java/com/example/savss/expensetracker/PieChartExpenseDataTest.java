package com.example.savss.expensetracker;

import com.github.mikephil.charting.data.PieDataSet;

import junit.framework.TestCase;

import org.junit.Assert;

public class PieChartExpenseDataTest extends TestCase {
    PieChartExpenseData pco=new PieChartExpenseData();

    public void testAdd() {
        pco.add("Movie",2000);
    }

    public void testGetPieDataSet() {
        Assert.assertEquals(100,100);
    }

    public void testGetTotalExpenseAmount() {
        Assert.assertEquals(0,pco.getTotalExpenseAmount());
    }
}