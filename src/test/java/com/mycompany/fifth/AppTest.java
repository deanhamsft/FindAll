package com.mycompany.fifth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldhave6words(){
        App app = new App();
        app.returnList.clear();
        app.main("testing");
        assertEquals(app.returnList.size(), 6); 
    }

    @Test
    public void shouldhave4words(){
        App app = new App();
        app.returnList.clear();
        app.main("knowing");
        assertEquals(app.returnList.size(), 4); 
    }
}
