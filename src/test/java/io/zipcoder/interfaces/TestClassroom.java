package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TestClassroom {
   @Test
    public void getRosterTest() {
   ArrayList<Person> instructors = new ArrayList<Person>();
   instructors.addAll(ZipCodeWilmington.getInstructors());
   HashMap<String, Person> expected = new HashMap<String, Person>();
   for(Person person: instructors) {
       expected.put(person.getName(), person);
   }
   HashMap<String, Person> actual = Classroom.getRoster(instructors);
   Assert.assertEquals(expected, actual);
   }
}
