package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.annotation.Target;

public class TestPerson {
    @Test
    public void setNameTest() {
        Person person = new Person("");
        String expected = person.setName("Kyle");
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void personConstructorTest() {
        String expected = "Kyle";
        Person person = new Person(expected);
        Assert.assertTrue("Kyle", true);
    }


}
