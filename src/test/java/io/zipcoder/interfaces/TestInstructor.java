package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.nio.DoubleBuffer;

public class TestInstructor {
    @Test
    public void implentationTest() {
        Instructor instructor = new Instructor(null);
        Assert.assertTrue(instructor instanceof Teacher);
    }
    @Test
    public void inheritanceTest() {
        Instructor instructor = new Instructor(null);
        Assert.assertTrue(instructor instanceof Person);
    }
    @Test
    public void teachTest() {
        Instructor instructor = new Instructor("Kyle");
        Student student = new Student("Kyle");
        Double expected = 100.0 ;
        instructor.teach(student, expected);
        Double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void lectureTest() {
        Instructor instructor = new Instructor("Kyle");
        Student[] students = new Student[1];
        Student student = new Student("Kyle");
        students[0] = student;
        Double expected = 100.0;
        instructor.lecture(students, expected);
        Double actual = students[0].getTotalStudyTime();
        Assert.assertEquals(expected, actual);
    }

}
