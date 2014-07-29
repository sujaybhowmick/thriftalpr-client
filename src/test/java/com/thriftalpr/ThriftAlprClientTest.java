package com.thriftalpr;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThriftAlprClientTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetAlprVersion() throws Exception {
       AlprClient client = AlprClient.Factory.getInstance();
       String actualVersion = client.getAlprVersion();
       String expectedVersion = "1.1.0";
       assertEquals(expectedVersion, actualVersion);
    }

    @Test
    public void testGetAlprVersionNotSame() throws Exception {
        AlprClient client = AlprClient.Factory.getInstance();
        String actualVersion = client.getAlprVersion();
        String expectedVersion = "1.0.0";
        assertNotEquals(expectedVersion, actualVersion);
    }
}