package javatest.code;

import org.testng.Assert;
import org.testng.annotations.Test;
import javatest.code.PrettyResponse;

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
        Assert.assertEquals(response, "Fail!!!");
        //Assert.assertNotEquals(response, "Fail!!!");
    }
}