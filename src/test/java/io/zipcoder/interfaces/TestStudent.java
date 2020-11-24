package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void implementationTest() {
        Student student = new Student(null);
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void inheritanceTest() {
        Student student = new Student(null);
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void learnTest() {
        Student student = new Student("Kyle");
        Double expected = 100.0;
        student.learn(100.00);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }
}
