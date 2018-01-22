package javatest.code;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PrettyResponseTest {

    @Test
    public void testGetResponse() {
        PrettyResponse tester = new PrettyResponse();
        String response = tester.getResponse();
        Assert.assertEquals(response, "Test OK Gooo JUnit!");
    }

    @Test
    public void testGetResponseError() {
        PrettyResponse tester = new PrettyResponse();
        String response = tester.getResponse();
        Assert.assertNotEquals(response, "Fail!!!");
    }
}