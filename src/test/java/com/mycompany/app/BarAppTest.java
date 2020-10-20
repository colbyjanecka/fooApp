package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import com.mycompany.app.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BarAppTest
{


    /**
     * Test BarApp.giveMeA1()
     */
    @Test
    public void get1FromApp()
    {
    BarApp app = new BarApp();

        assertTrue(app.giveMeA1() == 1);
    }


}
