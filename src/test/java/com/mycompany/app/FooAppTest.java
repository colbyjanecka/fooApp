package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import com.mycompany.app.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FooAppTest
{

    /**
     * Test giveMeAYes
     */
    @Test
    public void getYesFromApp()
    {
	FooApp app = new FooApp();

    	assertTrue(app.sayYes().equals("Yes!"));
    }

}
