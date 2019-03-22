package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    Person person = new Person(11023400L,"Bailey");
    People people = Students.getInstance();

    @Test
    public void addTest() {
        int expectedCount = people.getCount() + 1;

        //when
        people.add(person);
        int actual = people.getCount();
        Assert.assertEquals(expectedCount,actual);
    }

    @Test
    public void findByIdTest() {
        people.add(person);
        Assert.assertEquals(person, people.findById(person.getId()));
    }
    @Test
    public void removeTest() {
        people.add(person);
        int expectedCount = people.getCount() -1;
        people.remove(person);
        int actual = people.getCount();
        Assert.assertEquals(expectedCount,actual);
    }

    @Test
    public void removeByIdTest() {
        int expected = people.getCount();
        people.add(person);
        people.remove(person.getId());
        int actual = people.getCount();
        Assert.assertEquals(expected,actual);
    }
}