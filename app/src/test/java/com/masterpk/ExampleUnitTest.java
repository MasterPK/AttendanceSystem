package com.masterpk;

import com.masterpk.lib.ApiConnector;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void ApiRequest(){
        ApiConnector apiConnector = new ApiConnector("192.168.1.102");
        Assert.assertNotNull(apiConnector.doApiRequest("/schema"));
    }
}