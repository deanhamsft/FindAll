package com.mycompany.fifth;

import static org.junit.Assert.assertEquals;
import java.util.Set;
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
        app.main(new String[]{"testing"});
        assertEquals(app.returnList.size(), 6); 
    }

    @Test
    public void shouldhave4words(){
        App app = new App();
        app.returnList.clear();
        app.main(new String[]{"knowing"});
        assertEquals(app.returnList.size(), 4); 
    }

    @Test
    public void shouldhaveNowords(){
        App app = new App();
        app.returnList.clear();
        app.main(new String[]{"zykn"});
        assertEquals(app.returnList.size(), 0); 
    }

    @Test
    public void shouldhaveCombos(){
        App app = new App();
        Set<String> result = app.findPerms("zykn");
        assertEquals(result.size(), 24); 
    }

    @Test
    public void shouldSelectThreeLetter(){
        App app = new App();
        String result = app.selectLetters(Integer.toBinaryString(11), new char[]{'z','y','k','n'});
        assertEquals("nyz", result); 
    }

}
