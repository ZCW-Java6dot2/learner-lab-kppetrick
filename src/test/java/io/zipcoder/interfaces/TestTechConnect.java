package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class TestTechConnect {

    @Before
    public void setup() {
        TechConnect.removeStudents();
    }
    @Test
    public void removeStudentsTest() {
        boolean expected = true;
        boolean actual = TechConnect.getStudents().isEmpty();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void recruitStudentsTest() {
        Student student = new Student("Kyle");
        TechConnect.recruitStudent(student);
        boolean expected = true;
        boolean actual = TechConnect.getStudents().contains(student);
        Assert.assertEquals(expected, actual);
    }
}
