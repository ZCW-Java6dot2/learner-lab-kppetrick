package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestZipCodeWilmington {
    @Before
    public void setup() {
        ZipCodeWilmington.fireStaff();
    }
    @Test
    public void firestaffTest() {
        Boolean expected = true;
        ArrayList<Instructor> staff = ZipCodeWilmington.getInstructors();
        Boolean actual = staff.isEmpty();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void hireStaffTest() {
        Instructor instructor = new Instructor("Kyle");
        ZipCodeWilmington.hire(instructor);
        ArrayList<Instructor> expected = new ArrayList<Instructor>();
        expected.add(instructor);
        ArrayList<Instructor> actual = ZipCodeWilmington.getInstructors();
        Assert.assertEquals(expected, actual);
    }
}
